package prob1;
public class Entry {
	public Object key;
	public Object value;

	Entry(Object key, Object value) {
		this.key = key;
		this.value = value;
	}

	public String toString() {
		return key.toString() + "->" + value.toString() + " \n";
	}

}