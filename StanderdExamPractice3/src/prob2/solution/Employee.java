package prob2.solution;

import java.util.List;

public class Employee {
	
	String id;
	List<Account> accounts;
	
	public Employee(String id, List<Account> accounts) {
		this.id = id;
		this.accounts = accounts;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	
	public double getBalances() {
		
		double sum = 0.0;
		for (Account acc : accounts) {
			sum += acc.getBalance();
		}
		return sum;
	}
	
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
