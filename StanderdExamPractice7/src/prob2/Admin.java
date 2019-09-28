package prob2;

import java.util.LinkedList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		
		if (studentArray == null) return null;
		List<Student> retList = new LinkedList<Student>();
		if(studentArray.length == 0) return retList;
		
		for (int i = 0; i < studentArray.length; i++) {
			retList.add((Student) studentArray[i]);
		}
		
		return retList;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		if (studentList == null) return -1;
		if(studentList.isEmpty()) return 0.0;
		double avgGpa =0 ; 
		
		for (Student std : studentList) {
			avgGpa += std.computeGpa();
		}
		
		return avgGpa/studentList.size();
	}
}
