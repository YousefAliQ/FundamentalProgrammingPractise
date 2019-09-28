package prob1;

import java.util.Iterator;
import java.util.LinkedList;
import prob1.Entry;

public class MyHashtable<K, V> {
	private static final int INITIAL_SIZE = 19;
	
	private int tableSize;
	private LinkedList[] table;

	public MyHashtable() {
		this(INITIAL_SIZE);
	}

	public MyHashtable(int tableSize) {
		this.tableSize = tableSize;
		table = new LinkedList[tableSize];
	} // an array of LinkedList objects.

	public void put(Object key, Object value) {
		// disallow null keys
		if (key == null)
			return;

		// get the "big" integer corresponding to the object
		// assumes key is not null
		int hashcode = key.hashCode();

		// compress down to a table slot
		int hash = hashM(hashcode);

		// put the value and the key into an Entry object
		// which will be placed in the table in the
		// slot ( namely, hash)

		// allows a null value
		Entry e = new Entry(key, value);

		// now place it in the table
		if (table[hash] == null) {
			table[hash] = new LinkedList();
		}
		// this allows duplicate keys
		table[hash].add(e);
	}

	public Object get(Object key) {
		// null key not allowed
		if (key == null)
			return null;
		// get the "big" integer corresponding to the object
		int hashcode = key.hashCode();

		// compress down to a table slot
		int hash = hashM(hashcode);

		// now look for the desired Entry
		Entry e = null;

//First we should make sure that table[hash]
//is Not null.  If it is null, then the 
//Entry is Not there.      (JL 11-2009).

		Iterator it = table[hash].iterator();
		while (it.hasNext()) {
			e = (Entry) it.next();
			if (e.key.equals(key)) {
				return e.value;
			}
		}
		return null; // Not found.

	}

	public String toString() {
		String n = System.getProperty("line.separator");// a new line
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < table.length; ++i) {
			if (table[i] != null) {
				Iterator it = table[i].iterator();// For the
				// LinkedList at table[i]

				Entry next = null;
				while (it.hasNext()) {
					next = (Entry) it.next();
					sb.append(next);
				}
			}
		}
		return sb.toString();
	}

//In the java file this method might be called hash
	private int hashM(int bigNum) {
		return Math.abs(bigNum % tableSize);
	}

	public int countAllElements() {
		// TODO Auto-generated method stub
		if (table == null ) return -1;
		int count = 0;

		for (int i = 0; i < table.length; i++) {
			Iterator it;
			if (table[i] == null)
				continue;
			it = table[i].iterator();
			while (it.hasNext()) {
				count++;
				it.next();
			}
		}
		return count;
	}

	public int countlgtLinkedListElements() {
		// TODO Auto-generated method stub
		int count = 0;

		int longestLinkedList = 0;
		Iterator it;
		for (int i = 0; i < table.length; i++) {
			if (table[i] == null)
				continue;
			it = table[i].iterator();
			count = 0;
			while (it.hasNext()) {
				// System.out.println("i : " + i + " count : " + count);
				count++;
				it.next();
			}
			if (longestLinkedList < count) {
				longestLinkedList = count;
			}
		}
		return longestLinkedList;
	}

	public int countEmptyCells() {
		// TODO Auto-generated method stub
		int count = 0;

		for (int i = 0; i < table.length; i++) {
			if (table[i] == null)
				count++;
		}
		return count;
	}

}
