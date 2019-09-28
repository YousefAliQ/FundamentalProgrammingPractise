
public class RetirementAccount extends Account{

	RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}
	
	public String getAcctType() {
		return "RETIREMENT";
	}

}
