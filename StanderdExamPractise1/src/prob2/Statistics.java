package prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		if (aList == null) {
			return 0;
		}
		if (aList.isEmpty() ) {
			return 0;
		}
		
		double SumOfSalaries = 0;
		for(EmployeeData emp: aList) {
			SumOfSalaries += emp.getSalary();
		}
		
		return SumOfSalaries;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
