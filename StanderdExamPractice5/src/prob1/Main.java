package prob1;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			ArrayQueueImpl q = new ArrayQueueImpl();
			//q.peek();
			for(int i = 0; i < 15; i ++) {
				q.enqueue(i);
			}
			for(int i = 0; i < 14; i ++) {
				System.out.println(q.dequeue());
			}
			System.out.println(q.size());
			
		}catch(QueueException e) {
			System.out.println("Exception message : " + e.getMessage());
		}
		

	}

}
