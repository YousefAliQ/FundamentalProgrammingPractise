package The4th;

import java.util.LinkedList;


public class DoThe4th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myCustomLinkedList<String> cLinked = new myCustomLinkedList<String>();
		
		cLinked.removeMyFirst();
		System.out.println(" 0. " + cLinked);
		
		cLinked.addMyFirst("Omar");
		System.out.println(" 1. " + cLinked);
		
		cLinked.addMyFirst("Ali");
		System.out.println(" 2. " + cLinked);
		
		cLinked.addMyFirst("Yousef");
		System.out.println(" 3. " + cLinked);
		
		cLinked.addMyLast("Quran"); 
		System.out.println(" 4. " + cLinked);
		
		cLinked.addMyLast("is"); 
		System.out.println(" 5. " + cLinked);
		
		cLinked.addMyLast("very"); 
		System.out.println(" 6. " + cLinked);
		
		cLinked.addMyLast("good"); 
		System.out.println(" 7. " + cLinked);
		
		cLinked.addMyLast("name"); 
		System.out.println(" 8. " + cLinked);
		
		cLinked.removeMyFirst();
		cLinked.removeMyFirst();
		cLinked.removeMyFirst();
		
		System.out.println(" 9. " + cLinked);
		
		cLinked.removeMyLast();
		System.out.println(" 10. " + cLinked);
		cLinked.removeMyLast();
		
		System.out.println(" 11. " + cLinked);
		cLinked.removeMyLast();
		
		System.out.println(" 12. " + cLinked);
		cLinked.removeMyLast();
		
		System.out.println(" 13. " + cLinked);
		cLinked.removeMyLast();
		
		System.out.println(" 14. " + cLinked);
		cLinked.removeMyLast();
		
		System.out.println(" 15. " + cLinked);
		//cLinked.removeMyFirst();
		
		
		
		
		/*
		 * 
		 * cLinked.removeMyFirst(); System.out.println(" 1. " + cLinked);
		 * cLinked.removeMyLast(); System.out.println(" 1. " + cLinked);
		 */

	}

}
