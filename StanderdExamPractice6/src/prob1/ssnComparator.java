package prob1;

import java.util.Comparator;

public class ssnComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSsn().compareTo(o2.getSsn());
	}

}
