package W3D2LabFirstPkg;

import java.util.LinkedList;
import java.util.Scanner;

public class MainClass {

	LinkedList<Integer> myStack = new LinkedList<Integer>();
	
	LinkedList<Character> my2Stack = new LinkedList<Character>();
	LinkedList<Character> my2Queue = new LinkedList<Character>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainClass mainClass = new MainClass();

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter number to push the stack : "); int num =
		 * sc.nextInt();
		 * 
		 * System.out.println(mainClass.reverseIntegers(num));
		 */
		
		System.out.println("The match delemeters result of (a + b[(x+y)] + 10) is : "+ mainClass.matchDelematers("(a + b[(x+y)] + 10)"));
	}

	private boolean matchDelematers(String str) {

		boolean retVal = true;
		if (str == null) {
			return !retVal;
		}

		if (str.length() == 0) {
			return !retVal;
		}

		char temp;
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			if (temp == '(' || temp == ')' || temp == '{' || temp == '}' || temp == '[' || temp == ']' ) {
				my2Stack.push(temp);
				my2Queue.add(temp);
			}
			
		}

		char a,b;
		while ((!my2Queue.isEmpty()) && (!my2Stack.isEmpty())) {
			
			System.out.println("Queue : " + my2Queue.peek() + " " + "Stack : " + my2Stack.peek());
			a = my2Stack.peek();
			b = my2Queue.peek();
			if (a == getMirror(b)) {
				my2Stack.pop();
				my2Queue.remove();
			}else {
				retVal = false;
				break;
			}
		}
					
		return retVal;
	}
	
	private char getMirror(char ch) {
		if (ch == '(') return ')';
		if (ch == ')') return '(';
		if (ch == '{') return '}';
		if (ch == '}') return '{';
		if (ch == '[') return ']';
		if (ch == ']') return '[';
		return ' ';
	}

	private String reverseIntegers(int num) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (num != -1) {
			myStack.push(num);

			System.out.println("Enter next number, -1 to exit. ");
			num = sc.nextInt();
		}

		String retVal = getFormatedStack();
		return retVal;

	}

	public String getFormatedStack() {

		if (myStack.isEmpty()) {
			return "The Stack is empty!";
		}

		String s = "The reversed integers are: ";
		s += myStack.peek().toString();
		String temp = "";

		myStack.pop();
		while (!myStack.isEmpty()) {
			temp = myStack.peek().toString();
			myStack.pop();
			s += !myStack.isEmpty() ? ", " + temp : " and " + temp;
		}

		return s;
	}

}
