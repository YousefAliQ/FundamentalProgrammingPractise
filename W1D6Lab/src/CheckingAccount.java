
public class CheckingAccount extends Account{

	CheckingAccount(Employee emp , double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	public String getAcctType() {
		return "CHECKING";
	}
}
