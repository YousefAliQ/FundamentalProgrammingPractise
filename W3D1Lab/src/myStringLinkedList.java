import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class myStringLinkedList {

	static Scanner sc = new Scanner(System.in);
	List<Character> listOfA = new LinkedList<Character>();
	List<Character> listOfB = new LinkedList<Character>();
	List<Character> listOfC = new LinkedList<Character>();
	static myStringLinkedList myString = new myStringLinkedList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("\r\n Enter one of the following commands : \r\n"
				+ "     1. R -- reads in a string from the terminal.  \r\n"
				+ "     2. W -- writes a LinkedList to the terminal.  \r\n"
				+ "     3. C -- concatenate two strings. \r\n"
				+ "     4. L -- returns the length of a LinkedList.\r\n"
				+ "     5. E -- tests whether or not two LinkedLists are equal.  \r\n" 
				+ "     6. Q -- exit.");
		
		myString.initial(null);
	}

	private void initial(Character in) {
		// TODO Auto-generated method stub
		

		if (in == null) {
			System.out.println("\r\nEnter your next command : ");
			in = sc.nextLine().charAt(0);
		}

		if (in != 'Q') {
			myString.router(in);
		} else {
			System.out.println("\r\nGood Bye!");
			System.exit(0);
		}
	}

	private void router(Character in) {

		char ch;
		List<Character> list;
		switch (in) {
		case 'R':
			ch = myString.getStringName();
			String str = myString.readString();
			myString.addStringToLinkedList(str, myString.getTargetList(ch));
			break;
		case 'W':
			ch = myString.getStringName();
			list = myString.getTargetList(ch);
			myString.writeString(list);
			break;
		case 'C':
			System.out.println("Enter tow string names ... \r\n");
			ch = myString.getStringName();
			list = myString.getTargetList(ch);
			
			char ch2 = myString.getStringName();
			List<Character> listB = myString.getTargetList(ch2);
			
			listOfC = myString.concatenate(list,listB);
			break;
		case 'L':
			
			ch = myString.getStringName();
			list = myString.getTargetList(ch);
			myString.writeString(list);
			System.out.println(myString.len(list));
			break;
		case 'E':
			
			System.out.println("Enter tow string names ... \r\n");
			ch = myString.getStringName();
			list = myString.getTargetList(ch);
			
			ch2 = myString.getStringName();
			listB = myString.getTargetList(ch2);
			
			System.out.println(myString.equal(list, listB));

		}

		myString.initial(null); // re-call to take the next command.

	}

	private List<Character> concatenate(List<Character> list, List<Character> list2) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<list.size(); i++) {
			listOfC.add(list.get(i));
		}
		
		for(int i=0; i<list2.size(); i++) {
			listOfC.add(list2.get(i));
		}
		
		return listOfC;
	}

	private List<Character> getTargetList(char ch) {
		if ( ch == 'A' ) {
			return listOfA;
		}else {
			if ( ch == 'B' ) {
				return listOfB;
			}else {
				if (ch == 'C') {
					return listOfC;
				}
			}
		}
		return null;
	}

	private char getStringName() {
		
		System.out.println("\r\nEnter your string name : ");
		char ch = sc.nextLine().charAt(0);
		return ch;
		
	}

	private void addStringToLinkedList(String str, List<Character> list2) {

		for (int i = 0; i < str.length(); i++) {
			list2.add(str.charAt(i));
		}
		
	}

	private boolean equal(List<Character> list2, List<Character> list3) {
		
		if (list2 == null || list3 == null) {
			return false;
		}
		if(list2.size() != list3.size()) {
			return false;
		}
		
		
		for (int i=0; i<list2.size(); i++) {
			if (!list2.get(i).equals(list3.get(i))) {
				return false;
			}
		}
		return true;
		
	}
	private int len(List<Character> list2) {
	
		if (list2 != null) {
			return list2.size();
		}
		return -1;
	}

	private void writeString(List<Character> list) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

	private String readString() {
		System.out.println("\r\nEnter your string : ");

		String str = "";

		if (sc.hasNextLine()) {
			str = sc.nextLine();
		}
		System.out.println("\r\nYou entered : " + str);

		return str;
	}

}
