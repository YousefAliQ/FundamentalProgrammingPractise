
public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float fNumber = (float) 1.27;
		float sNumber = (float) 3.881;
		float tNumber = (float) 9.6;

		int sum = (int) (fNumber + sNumber + tNumber);
		System.out.println("The Sum obtained by casting : " + sum);

		sum = Math.round(fNumber + sNumber + tNumber);
		System.out.println("The Sum obtained by rounding : " + sum);

	}

}
