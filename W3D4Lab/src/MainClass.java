
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyBST myBst = new MyBST();
		
		for (int i = 0; i < 6; i+=2) {
			myBst.insert(i);
		}
		
		System.out.println("\nIn Order : ");
		myBst.printTree(bstTravirsal.LVR);
		
		System.out.println("\nPre Order : ");
		myBst.printTree(bstTravirsal.VLR);
		
		System.out.println("\nPost Order : ");
		myBst.printTree(bstTravirsal.LRV);
		
		System.out.println("\nCount Leaves : ");
		System.out.println(myBst.countLeaves(myBst.getRoot())); 
		
		System.out.println("\nCount Nodes : ");
		System.out.println(myBst.countNodes(myBst.getRoot())); 
		
		System.out.println("\nIs All Even Nodes : ");
		System.out.println(myBst.allEven(myBst.getRoot())); 
		
		
	}

}
