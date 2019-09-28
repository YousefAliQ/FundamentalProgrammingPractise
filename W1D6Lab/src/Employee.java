import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

//same as the Employee class defined in the lecture
public class Employee {

	// instance fields

	 ArrayList<Account> accounts = new ArrayList<Account>();
	
	private String name;
	private double salary;
	private Date hireDay;
	

//constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	Employee(String aName, int aYear, int aMonth, int aDay) {
		this(aName, 0, aYear, aMonth, aDay);
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public double yearlyFederalTax(double salary) {
		double tax = 0;

		if (salary > 80000) {
			tax = salary * (28 / 100);
		} else {
			if (salary > 50000) {
				tax = salary * (24 / 100);
			} else {
				if (salary > 26000) {
					tax = salary * (20 / 100);
				}
			}
		}
		return tax;
	}

	public void createNewChecking(double startingBalance) {
		accounts.add(new CheckingAccount(this, startingBalance));
	}

	public void createNewSavings(double startingBalance) {
		// TODO Auto-generated method stub
		accounts.add(new SavingAccount(this, startingBalance));
	}

	public void createNewRetirement(double startingBalance) {
		// TODO Auto-generated method stub
		accounts.add(new RetirementAccount(this, startingBalance));
	}

	public void deposit(String type, double amount) {
		
		for(Account acc : accounts) {
			if (accounts.getClass().equals(type)) {
				acc.makeDeposit(amount);
			}
		}
		
	}

	public boolean withdraw(String type, double amount) {
		
		
		for(Account acc : accounts) {
			if (accounts.getClass().equals(type)) {
				
				return acc.makeWithdrawal(amount);
			}
		}
		return false;
	}

	// needs to be improved!!
	public String getHireDay() {

		String str = String.format("%tD", hireDay);
		return str;
	}

	// instance methods
	public String getName() {
		return name;
	}
	
	public String getFormattedAccountInfo() {
		// TODO Auto-generated method stub
		 String str = "\nACCOUNT INFO FOR " + this.name + "\n";
		
		 for ( Account acc : accounts) {
			 if (acc != null) {
				 str += acc.toString();
			 }
		 }
		 return str;
	}

	

}