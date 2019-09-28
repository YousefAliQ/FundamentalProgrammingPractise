package prob1;

public class DoublyLinkedList {

	Node header;

	DoublyLinkedList() {
		header = new Node();
	}

	// adds to the end of the list
	public void addLast(String item) {
		// implement

		if (item == null || item.length() == 0 || header == null) {
			return;
		}

		Node node = new Node();
		node.value = item;

		// case of empty ..
		if (header.next == null) {

			node.next = null;
			node.previous = header;

			header.next = node;
			header.previous = null;
		} else {
			// case of two nodes ..

			Node lastNode = header.next;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}

			lastNode.next = node;
			node.previous = lastNode;
		}

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		toString(sb, header);
		return sb.toString();

	}

	private void toString(StringBuilder sb, Node n) {
		if (n == null)
			return;
		if (n.value != null)
			sb.append(" " + n.value);
		toString(sb, n.next);
	}

	class Node {
		String value;
		Node next;
		Node previous;

		public String toString() {
			return value == null ? "null" : value;
		}

		public Node next() {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public static void main(String[] args) {
		try {
			
			DoublyLinkedList list = new DoublyLinkedList();
			
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			
			System.out.println("The list starting from head :" + list);
			
			Node current = list.header;
			while (current.next != null) {
				current = current.next;
			}
			
			System.out.print("The list starting from tail : ");
			while (current.previous != null) {
				System.out.print( current.value + " ");
				current = current.previous;
			}

		}catch( NullPointerException ex) {
			System.out.println("Null Error!");
		}
		

	}

}
