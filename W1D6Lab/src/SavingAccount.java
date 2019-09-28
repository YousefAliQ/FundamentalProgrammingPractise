
public class SavingAccount extends Account{

	final static double interestPecentage = 0.25;
	SavingAccount(Employee emp,  double balance) {
		super(emp,  balance);
		// TODO Auto-generated constructor stub
	}
	
	public String getAcctType() {
		return "SAVINGS";
	}


}
