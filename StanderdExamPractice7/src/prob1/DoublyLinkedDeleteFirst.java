package prob1;
public class DoublyLinkedDeleteFirst {

	Node header;

	public DoublyLinkedDeleteFirst() {
		header = new Node();
	}

	// removes the node at position 1 and returns
	// the string contained in that node
	public String deleteFirst() throws IllegalStateException {

		if (header == null)
			throw new IllegalStateException();
		if (header.next == null)
			throw new IllegalStateException();
		if (header.next.next == null)
			throw new IllegalStateException();

		Node deleted = header.next.next;
		Node node0 = header.next;
		if (deleted.next != null) {
			node0.next = node0.next.next;
			node0.next.previous = node0;
		} else {
			node0.next = null;
		}

		return deleted.value;
	}

	public boolean isEmpty() {
		// implement
		return true;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}
		Node n = new Node();
		n.value = item;
		next.next = n;
		n.previous = next;

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
	}

	public static void main(String[] args) {
		DoublyLinkedDeleteFirst list = new DoublyLinkedDeleteFirst();
		list.addLast("Bob");
		list.addLast("Harry");
		list.addLast("Steve");
		try {
			String deleted = list.deleteFirst();
			System.out.println("This item was deleted: " + deleted);
		} catch (IllegalStateException e) {
			System.err.println("Exception message : " + e.getMessage());
		}
		System.out.println(list);

	}
}
