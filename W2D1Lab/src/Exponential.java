
public class Exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exponential expo = new Exponential();
		System.out.println(expo.power(2, 8));
	}

	double power(double x, int n) {

		if (n == 1) {
			return x;
		}
		double retVal = x * power (x, n-1);
		
		return retVal;
	}

}
