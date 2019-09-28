package The4th;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class myCustomLinkedList<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Node header;
	Node node;
	Node tail;

	public myCustomLinkedList() {
		// TODO Auto-generated constructor stub
		header = new Node(null, null, "head");
		tail = new Node(null, null, "tail");
		header.next = tail;
	}

	public Node addMyFirst(String str) {

		// 1. create the node ..
		Node n = new Node(null, null, (java.lang.String) str);

		// case of empty.
		if (header.next == null) {
			header.next = n;
			tail.prev = n;
			n.next = tail;
			n.prev = header;
		} else {
			// case of list.
			n.next = header.next;
			n.prev = header;
			header.next.prev = n;
			header.next = n;
		}
		return n;
	}

	public void removeMyFirst() {

		// making the heading pointing to the second element by the following steps..

		// 1. if the list is empty.
		if (header.next == null)
			return;

		// 2. if the list is NOT one node only.
		if (header.next.next != null) {
			header.next = header.next.next;
			header.next.prev = header;
		} else {

			// 3. if the list is only one node.
			header.next = null;
		}

	}

	public Node addMyLast(String str) {

		String s = str;

		// 1. create the node ..
		Node node = new Node(null, null, (java.lang.String) s);

		// 2. if list is not empty -- go throw it until the last element.
		Node next = header;
		while (next.next != null) {
			next = next.next;
		}

		// next is the tail ..
		node.prev = next.prev;
		node.next = tail;
		next.prev.next = node;
		tail.prev = node;

		return node;

	}

	public void removeMyLast() {

		// case of empty.
		if (header.next == null || header.next == tail) {
			return;
		}
		// case of one.
		if (header.next.next == tail) {
			header.next = tail;
			tail.prev = header;
			
		} else {
			// case of list
			Node before = tail.prev.prev;
			before.next = tail;
			tail.prev = before;
		}

	}

	@SuppressWarnings("unchecked")
	public java.lang.String toString() {

		String retVal = (String) "List is empty! ";

		if (header.next == null || header.next == tail) {
			return (java.lang.String) retVal;
		}
		retVal = (String) "";
		Node n = new Node(header, null, null);

		do {
			n = n.next;
			retVal = (String) (retVal + n.value + " -- ");
		} while (n.next != null);
		return (java.lang.String) retVal;
	}

}
