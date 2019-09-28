package prob2;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		
		if (vehicleArray == null) {
			return null;
		}
		
		if (vehicleArray.length == 0) {
			return null;
		}
		
		List<Vehicle> retList = new ArrayList<Vehicle>();
		for(Object v : vehicleArray) {
			retList.add((Vehicle) v);
		}
		
		return retList;
	}
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		
		if (vehicleList == null) {
			return -1;
		}
		
		if (vehicleList.isEmpty()) {
			return -1;
		}
		
		int miles = 0;
		for(Vehicle v : vehicleList) {
			
			miles += v.getMilesUsedToday();
		}
		
		return miles;
	}
}
