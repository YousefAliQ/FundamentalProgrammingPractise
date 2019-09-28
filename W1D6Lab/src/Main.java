import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Employee employee = new Employee("Joe", 100000, 1993, 1, 20); Account
		 * accSaving = new Account(employee, Account.SAVINGS, 300); Account
		 * accRetirement = new Account(employee, Account.RETIREMENT, 300);
		 * 
		 * System.out.println( accSaving.toString() + " | " + accRetirement.toString());
		 * 
		 * System.out.println(employee.getHireDay());
		 */

		Employee[] emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(1);
		emps[0].createNewSavings(1);
		emps[0].createNewRetirement(1);
		emps[1].createNewChecking(1);
		emps[1].createNewSavings(1);
		emps[2].createNewChecking(1);
		emps[2].createNewSavings(1);
		emps[2].createNewRetirement(1);

		System.out.println(" Total balances for all employees : " + String.format("%.2f", forAllEmployeesTotalOfAllBalances(emps)) + "\n");
		Scanner sc = new Scanner(System.in);
		
		/*
		 * //for phase I – console output 
		 * System.out.print("See a report of all account balances? (y/n) "); String
		 * answer = sc.next(); if (answer.equalsIgnoreCase("y")) { String info =
		 * getAccountInfo(emps); System.out.println(info); // display info to console }
		 * else { // do nothing..the application ends here }
		 */
		
		System.out.println("A. See a report of all accounts.\r\n" + 
				"B. Make a deposit.\r\n" + 
				"C. Make a withdrawal.\r\n" + 
				"Make a selection (A/B/C):\r\n" + 
				"");
		
		String answer = sc.next(); 
		if (answer.equalsIgnoreCase("A")) {
			String info = getAccountInfo(emps); System.out.println(info);
		}else
		{
			if (answer.equalsIgnoreCase("B")) {
			String names =	getAccountNames(emps); System.out.println(names);
			System.out.println("Select an employee: (type a number) ");
			
			int empNumber = sc.nextInt();
			
			System.out.println(getAccountTypes(emps[empNumber]));
			System.out.println("Select an account: (type a number) ");
			
			int accNumber = sc.nextInt();
			System.out.println("Deposit amount: ");
			
			double depositeAmount = sc.nextDouble();
			emps[empNumber].deposit(getAccountName(accNumber), depositeAmount);
			
			System.out.println(
					"$"+ String.format("%.2f", depositeAmount) + 
					" has been deposited in the \r\n" + 
					getAccountName(accNumber).replace("Account", " account") +
					" of " + emps[empNumber].getName() );
			
			}else 
			{
				if (answer.equalsIgnoreCase("C")) {
					
					String names =	getAccountNames(emps); System.out.println(names);
					System.out.println("Select an employee: (type a number) ");
					
					int empNumber = sc.nextInt();
					
					System.out.println(getAccountTypes(emps[empNumber]));
					System.out.println("Select an account: (type a number) ");
					
					int accNumber = sc.nextInt();
					System.out.println("Withdraw amount: ");
					
					double withdrawAmount = sc.nextDouble();
					boolean withdrawResult = emps[empNumber].withdraw(getAccountName(accNumber), withdrawAmount);
					
					if (withdrawResult) {
						System.out.println(
								"$"+ String.format("%.2f", withdrawAmount) + 
								" has been deposited in the \r\n" + 
								getAccountName(accNumber).replace("Account", " account") +
								" of " + emps[empNumber].getName() );
					}else 
					{
						System.out.println("The requested ammount is bigger than the available balance.");
					}
					
					
				} 
			}
		}
			
		
	}

	private static  String getAccountName(int accNumber) {
		String type = "";
		
		switch(accNumber) {
		case 0 : type = "CheckingAccount"; break;
		case 1 : type = "SavingAccount"; break;
		case 2 : type = "RetirementAccount"; break;
		}
		
		return type;
	}

	private static String getAccountTypes(Employee employee) {
		
		String str = "";
		int counter = 0;
		for (Account acc : employee.accounts) {
			str += ( counter++ ) + ". " +  acc.getAccountType()  + " \n";
		}
		return str;
	}

	private static String getAccountNames(Employee[] emps) {
		
		String str = "";
		int counter = 0;
		for (Employee emp : emps) {
			str += (counter++) + ". " + emp.getName() + " \n";
		}

		return str;
	}

	private static String getAccountInfo(Employee[] emps) {
		
		String str = "";

		for (Employee emp : emps) {
			str += emp.getFormattedAccountInfo();
		}

		return str;
	}
	
	private static double forAllEmployeesTotalOfAllBalances(Employee[] emps) {
		double allEmployeesTotal = 0.0;
		
		for(Employee emp : emps) {
			allEmployeesTotal += totalOfAllBalances(emp);
		}
		return allEmployeesTotal;
	}
	
	private static double totalOfAllBalances(Employee emp) {
		
		if (emp == null) {
			return -1;
		}
		double total = 0.0;
		for (Account acc : emp.accounts) {
			total += acc.getBalance();
		}
		return total;
	}

}