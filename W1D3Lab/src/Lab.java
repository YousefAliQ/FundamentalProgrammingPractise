import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(isPlaindrome("noon")); // first method ...

		 //proccessStringBuffer(); // second method ...

		// int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22}; // second method ...
		// System.out.println(min(arr));
//System.out.println(rev("Hello"));
		//starProblems();
		
		//String str = "12345";
		//System.out.println(reverse(str));
		
	}
	
	private static String reverse(String str) {
		// TODO Auto-generated method stub
	
		if (str == null || str.length() == 0) return null;
		
		System.out.println("str is : " + str);
		if (str.length() == 1) return str;
		
		int mid = str.length()/2;
		
		return(reverse(str.substring(mid)) + reverse(str.substring(0,mid)));
	}	

	static String rev(String s) {
		if(s == null || s == "" || s.length()==1)
			return s;
		else
			return rev(s.substring(1)) + s.charAt(0);
	}

	private static boolean isPlaindrome(String str) {

		int strLength = str.length() - 1;
		for (int i = 0; i < str.length() / 2; i++) {
				if (str.charAt(i) != str.charAt(strLength - i)) {
				return false;
			}
		}

		return true;
	}

	private static void proccessStringBuffer() {

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		StringBuffer sBuffer = new StringBuffer();
		StringBuffer out = new StringBuffer();
		sBuffer.append(str);
		sBuffer.append("bye");

		for (int i = 0; i < sBuffer.length(); i++) {
			if (Character.isLowerCase(sBuffer.charAt(i))) {
				out.append(Character.toUpperCase(sBuffer.charAt(i)));
			} else {
				out.append(Character.toLowerCase(sBuffer.charAt(i)));
			}
		}
		System.out.println(out);

	}

	private static int min(int[] arrayOfInts) {

		int min = arrayOfInts[0];

		for (int x : arrayOfInts) {
			if (x < min) {
				min = x;
			}
		}

		return min;
	}
	
	private static int avg(int[] arrayOfInts) {

		if (arrayOfInts == null) {
			return -1;
		}
		
		if (arrayOfInts.length == 0) {
			return -1;
		}
		
		int sum = 0;
		for (int x : arrayOfInts) {
			sum += x;
		}

		return sum/arrayOfInts.length;
	}

	
	private static void starProblems() {

		System.out.println("Input number of base stars : ");
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());

		System.out.println("\nFirst Shape ...\n");

		// 1st picture
		for (int i = 0; i < num; ++i) {
			for (int j = 0; j <= i; ++j) {
				if (j == 0 || j == i || i== num-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
			
		}

		System.out.println("\nSecond Shape ...\n");

		// 2nd picture
		for (int i = num-1; i >= 0; i--) {
			for (int j = 0; j <= num-1; j++) {
				if (j == num-1 || j == i || i == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
			
		}

		System.out.println("\nThird Shape ...\n");

		// 3rd picture
		// must be odd number
		if (num % 2 == 0) {
			num += 1;
		}

		int mid = num / 2; // middle number & number of rows..
		for (int i = 0; i < mid+1; i++) {
			for (int j = 0; j < num; j++) {
				if ( j == mid - i || j == mid + i || i == mid ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

			
		}

		System.out.println("\nForth Shape ...\n");

		// 4rd picture
		// must be odd number
		if (num % 2 == 0) {
			num += 1;
		}

		mid = num / 2; // middle number & number of rows..
		for (int i = 0; i < mid+1; i++) {
			for (int j = 0; j < num; j++) {
				if ( j == mid - i || j == mid + i || i == mid ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = mid; i > 0; i--) {

			for (int j = num-1; j >= 0; j--) {
				if (j == mid - i + 1 || j == mid + i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}

	}
}
