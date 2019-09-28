package The4th;

public class Node {
	String value;
	Node next;
	Node prev;
	
	public Node(Node next, Node prev, String str) {
		this.value = str;
		this.next = next;
		this.prev = prev;
	}
}
