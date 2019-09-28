
public class Fibonanci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonanci fib = new Fibonanci();
		System.out.println(fib.getFibonanci(25));
	}
	
	private int getFibonanci(int i) {
		// TODO Auto-generated method stub
		
		if (i == 0 || i == 1) {
			return i;
		}
		int retVal = getFibonanci(i-1) + getFibonanci(i-2);
		return retVal;
	}

}
