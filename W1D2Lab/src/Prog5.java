import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		int xCounter = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));

			if (str.charAt(i) == 'x') {
				xCounter++;
			}
		}
		System.out.println("\n" + xCounter + " 'x' characters");
	}

}
