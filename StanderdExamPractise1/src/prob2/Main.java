package prob2;

import java.util.*;
public class Main {

	/** Combines the lists that are populated here into a single list
	 *  and passes to computeSumOfSalaries
	 */
	public static void main(String[] args) {
		List<Staff> staff = new ArrayList<>();
		staff.add(new Staff("John", 1, 2));
		staff.add(new Staff("Tom", 1, 4));
		staff.add(new Staff("Edward", 1, 1));
		staff.add(new Staff("Rich",1, 3));
		staff.add(new Staff("Kevin", 1,1));

		List<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher("Andrew", 1, 1));
		teachers.add(new Teacher("Rabelais", 1, 1));
		teachers.add(new Teacher("Phil", 1, 1));
		teachers.add(new Teacher("Tony",1, 1));
		
		
		//Implementation steps
		//Step 1: implement the combine method, to combine the two lists
		List<EmployeeData> combined = combine(staff, teachers);
		
		//Step 2: pass the combined list to computeSumOfSalaries
		double salarySum = Statistics.computeSumOfSalaries(combined);
		System.out.printf("%.2f", salarySum);
		
	}
	
	//IMPLEMENT
	public static List<EmployeeData> combine(List<Staff> staff, List<Teacher> teachers) {
		
		
		List<EmployeeData> emps = new ArrayList<EmployeeData>();
		
		if (staff == null || teachers == null) {
			return emps;
		}
		
		if (!staff.isEmpty()) {
			emps.addAll(staff);
		}
		
		if (!staff.isEmpty()) {
			emps.addAll(teachers);
		}
		
		return emps;
	}

}
