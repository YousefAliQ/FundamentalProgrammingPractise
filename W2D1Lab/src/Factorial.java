
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fac = new Factorial();
		System.out.println(fac.getFactorial(5));
		
	}

	

	private int getFactorial(int i) {
		// TODO Auto-generated method stub
		if (i == 0 || i == 1) {
			return 1; 
		}
		int retVal = i * getFactorial(i-1);
		return retVal;
	}
	
	

}
