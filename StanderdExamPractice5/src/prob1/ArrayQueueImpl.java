package prob1;


public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	
	public int peek() throws QueueException {
		if (!this.isEmpty()) {
			return arr[front];
		}else
		{
			throw new QueueException("Empty Exception!");
		}
		
		//implement
	}
	
	public void enqueue(int obj){
		//implement
		
		// check the size .. 
		if ( this.size() >= arr.length ) {
			resizeArr();
			arr[rear++] = obj;
		}else {
			arr[rear++] = obj;
		}
		if (front == -1) front++;
	}
	
	private void resizeArr() {
		// TODO Auto-generated method stub
		
		int[] arrTemp = new int[arr.length*2];
		
		for(int i=0; i<arr.length; i++) {
			arrTemp[i] = arr[i]; 
		}
		
		arr = arrTemp;
	}

	public int dequeue() throws QueueException{
		
		if (!this.isEmpty()) {
			return arr[front++];
		}else
		{
			throw new QueueException("Empty Exception!");
		}
		
		//implement
	}
	
	public boolean isEmpty(){	
		//implement
		
		if (front == -1 || rear == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public int size(){	
		//implement
		if (front != -1) {
			return rear - front;
		}else {
			return 0;
		}
		
		
	}
	
}
