import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;
	private GregorianCalendar cal = new GregorianCalendar();
	private Map<Object, Object> balanceChargesMonthly;

	Account(Employee emp, double balance) {
		employee = emp;
		
		this.balance = balance;

		// 0-11 months
		balanceChargesMonthly = Stream
				.of(new Object[][] { { 0, false }, { 1, false }, { 2, false }, { 3, false }, { 4, false }, { 5, false },
						{ 6, false }, { 7, false }, { 8, false }, { 9, false }, { 10, false }, { 11, false } })
				.collect(Collectors.toMap(data -> (int) data[0], data -> (Boolean) data[1]));

	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}
	
	public String getAccountType() {
		String accountType = this.getClass().toString().replace("class ", "").replace("Account", " Account");
		return accountType;
	}

	public String toString() {
		String str = "";
		str += "Account type : " + getAccountType() + "\nCurrent balance : " + this.getBalance() + "\n";
		return str;

	}

	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {

		if (amount <= balance) {
			
			if (this.getClass().equals(Account.RETIREMENT)) {
				 // not charged for this month
				int currentMonth = cal.get(Calendar.MONTH);
				if (!(boolean) balanceChargesMonthly.get(currentMonth)) { // not charged for this month
					balance -= balance * (2/100); // need to check the balance here .. 
					balanceChargesMonthly.put(currentMonth, true);
				}
				
			}
			if (balance < amount) {
				System.out.println("Sorry, the balance is less than the ammount!");
				return false;
			}
			balance -= amount;
			return true;
		}
		return false;
	}

	public double getBalance() {

		if (this.getClass().equals(Account.CHECKING)) {
			int currentMonth = cal.get(Calendar.MONTH);
			if (!(boolean) balanceChargesMonthly.get(currentMonth)) { // not charged for this month
				balance += 5; // need to check the balance here .. 
				balanceChargesMonthly.put(currentMonth, true);
			}
		}else 
		{
			if(this.getClass().equals(Account.SAVINGS)) {
				int currentMonth = cal.get(Calendar.MONTH);
				if (!(boolean) balanceChargesMonthly.get(currentMonth)) { // not charged for this month
					balance += balance * SavingAccount.interestPecentage; // need to check the balance here .. 
					balanceChargesMonthly.put(currentMonth, true);
				}
			}
		}
		return balance;
	}

	public double computeInterest() {
		double interest = 0.0;
		
		if (this.getClass().equals(Account.CHECKING)) {
			interest = balance * 0.02;
		} else {
			if (this.getClass().equals(Account.SAVINGS)) {
				interest = balance * 0.04;
			} else {
				if (this.getClass().equals(Account.RETIREMENT)) {
					interest = balance * 0.05;
				}
			}
		}
		return interest;
	}

}
