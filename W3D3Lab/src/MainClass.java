import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MainClass {

	LinkedList<Integer> myStack = new LinkedList<Integer>();
	LinkedList<Integer> myQueue = new LinkedList<Integer>();
	
	LinkedList<Integer> my2Stack = new LinkedList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass myObj = new MainClass();
		// fill stack and queue .. 
		for(int i=0; i<10; i++) {
			myObj.myStack.push(i);
			myObj.myQueue.add(i);
		}
		
		
		for(int i=20; i<30; i++) {
			myObj.my2Stack.push(i);
		}
		
		System.out.println("my queue : " + myObj.myQueue);
		System.out.println("my stack : " + myObj.myStack);
		
		
		myObj.myQueue = myObj.fromTo(myObj.myStack, myObj.myQueue,"Queue");
		
		System.out.println("my queue after : " + myObj.myQueue);
		
		myObj.myStack = myObj.fromTo(myObj.myStack, myObj.myQueue,"Stack");
		
		System.out.println("my stack after : " + myObj.myStack);
		
		System.out.println("Empty one stack on the other ... ");
		
		System.out.println("Stack 1 : " + myObj.myStack);
		System.out.println("Stack 2 : " + myObj.my2Stack);
		
		LinkedList<Integer> temp = new LinkedList<Integer>();
		
		while(!myObj.my2Stack.isEmpty()) {
			temp.push(myObj.my2Stack.pop());
		}
		
		System.out.println(myObj.myStack.peek());
		
		while (!temp.isEmpty()) {
			myObj.myStack.push(temp.pop());
		}
		
		System.out.println("Stack 1 after : " + myObj.myStack);
		
		System.out.println(" Enter a string with a colon : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println(readOneLine(input));
	}
	private static char readOneLine(String input) {
		// TODO Auto-generated method stub
		
		if (input == null) return 'N';
		
		if (input.length() == 0 ) return 'N';
		
		for (int i=0; i<input.length(); i++) {
			if (input.charAt(i) == ':') {
				if (i == input.length()/2) {
					if (isMatch(input)) {
						return 'S';
					}else
					{
						return 'D';
					}
					// D or S
				}else
				if (i < input.length()/2 ) {
					return 'R';
				}else {
					return 'L';
				}
			}
		}
		
		return 'N';
	}
	private static boolean isMatch(String input) {
		// TODO Auto-generated method stub
		
		if (input == null) return false;
		
		LinkedList<Character> stack = new LinkedList<Character>();
		LinkedList<Character> queue = new LinkedList<Character>();
		
		for (int i = 0; i < input.length()/2; i++) {
			stack.push(input.charAt(i));
			queue.add(input.charAt(input.length()-1-i));
		}
		
		while(!stack.isEmpty()) {
			if (stack.pop() != queue.remove()) {
				return false;
			}
		}
		
		return true;
	}
	private LinkedList<Integer> fromTo(LinkedList<Integer> myStack, LinkedList<Integer> myQueue, String to) {
		// TODO Auto-generated method stub
		
		if (myQueue == null || myStack == null) {
			return null;
		}
		
		if (to == "Queue") {
		
			while(!myStack.isEmpty()) {
				myQueue.add(myStack.peek());
				myStack.pop();
			}
			return myQueue;
			
		}else {
			if (to == "Stack") {
				
				while(!myQueue.isEmpty()) {
					myStack.push(myQueue.peek()); 
					myQueue.remove();
				}
				return myStack;
				
			}
		}
		
		return null;
		
	}

}
