package prob2.solution;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double sum = 0.0;
		
		for(Employee emp : emps) {
			sum += emp.getBalances();
		}
				
		return sum;
	}
}
