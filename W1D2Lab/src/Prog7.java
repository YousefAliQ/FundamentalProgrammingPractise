import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b;
	       int a = (b = 5);
	       System.out.println(a);
		String s = "a friendly face";
		System.out.println(s.substring(4));
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		String tableName = str.substring(str.indexOf("table name = "), str.indexOf("number of column names ")).trim(); 
		str = str.substring(str.indexOf("number of column names = "), str.length());
		String columnNames = "";
		int numOfColumns = Integer.parseInt(str.substring(0,str.indexOf(' ')));
		System.out.println(numOfColumns);
		for(int i=0 ; i< numOfColumns; i++) {
			System.out.println();
		}
	}

}
