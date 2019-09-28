package prob1;

import java.util.Iterator;

public class MainClass {

	public static void main(String []args) {
		
		MyHashtable<String, String> myHashtable = new MyHashtable<String, String>();
		
		myHashtable.put("John Smith", "641-472-1111");
		myHashtable.put("Julie Woods", "641-472-2222");
		myHashtable.put("A", "641-472-2222");
		myHashtable.put("A", "641-472-2222");
		myHashtable.put("B", "641-472-2222");
		myHashtable.put("C", "641-472-2222");
		myHashtable.put("D", "641-472-2222");
		myHashtable.put("E", "641-472-2222");
		myHashtable.put("F", "641-472-2222");
		myHashtable.put("G", "641-472-2222");
		
		
		System.out.println(myHashtable);
		
		System.out.println("The Count is : " + myHashtable.countAllElements());
		System.out.println("The Longest LinkedList Count is : " + myHashtable.countlgtLinkedListElements());
		System.out.println("The count of empty cells : "+ myHashtable.countEmptyCells());
		
		
	}
}
