package prob1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input list
	 * socSecNums and whose salary is > 80000. The list must be ordered by social
	 * security number, from lowest to highest. To sort, you must use a Collections
	 * sorting method and you must define your own Comparator to be used to compare
	 * Employees by ssn.
	 */
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {

		if (table == null || socSecNums == null)
			return null;

		List<Employee> retList = new LinkedList<Employee>();

		// for (int i = 0; i < socSecNums.size(); i++) {
		for (String ssn : socSecNums) {

			if (table.containsKey(ssn)) {
				Employee temp = table.get(ssn);

				if (temp.getSalary() > 80000) {
					retList.add(temp);
				}

			}

		}

		// }

		return retList;

	}

}
