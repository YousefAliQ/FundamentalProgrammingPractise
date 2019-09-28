import java.util.Date;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = new Professor("Prof1", 100000, new Date(), 10);
		department[1] = new Professor("Prof2", 200000, new Date(), 10);
		department[2] = new Professor("Prof3", 300000, new Date(), 10);
		department[3] = new Secretary("Secr1", 40000, new Date(), 200);
		department[4] = new Secretary("Secr1", 50000, new Date(), 200);
		department[4] = new Administrator("Secr1", 50000, new Date(), 200);

		System.out.println("Do you wish to see the sum of all salaries ? (Y/N) ");
		Scanner sc = new Scanner(System.in);

		if (sc.next().equalsIgnoreCase("Y")) {
			int sum = 0;
			for (DeptEmployee emp : department) {
				sum += emp.computeSalary();
			}
			System.out.println("the Salaries is equal : " + sum);
		}

		System.out.println("Do you wish to see the sum of all salaries ? (Y/N) ");

		if (sc.next().equalsIgnoreCase("Y")) {
			System.out.println("Who is him/her ? ");
			String targetName = sc.next().trim();
			String out = "";
			for (DeptEmployee emp : department) {
				if (emp.getName().equalsIgnoreCase(targetName)) {
					String dFormat = "%tD";
					out += "Employee Name : " + emp.name + "\n" + "Employee Salary : " + emp.salary + "\n"
							+ "Employee position : " + emp.getClass().toString().substring(6) + "\n"
							+ "Employee Hire Date : " + String.format(dFormat, emp.hireDate);
				}

			}

			if (out == "") {
				System.out.println("Sorry, we could not find him/her!");
			}

			System.out.println(out);

		}

	}

}
