package QueueAP;



public class Circular_Queue {
	static class Queues{
		static int arr[];  //array
		static int size;  //to store size from Constructor
		static int rear = -1; 
		static int front = -1;
		Queues(int size){
			arr = new int[size];
			this.size = size;
			arr = new int[size];
			rear = -1;
		}
		
		public static boolean isEmpty() {
			return rear == -1 && front == -1;  //Queue khali hai
		}
		
		public static boolean isFull() {
			return (rear + 1)% size == front;
		}
		
		//enqueue
		public static void add(int data) {
			//Queue is full
			if(isFull()) {
				System.out.println("OverFlow");
				return;
			}
			//front value we remove
			if(front == -1) {
				front = 0;
			}
			//now shifting front (1st element add)
			rear =  (rear+1)% size; //here rear goes to -1 to 0 
			arr[rear] = data;
		}
		
		
		//dequeue
		public static int dequeue() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			
			int result = arr[front];
			/*If we remove single element then Front and rear come at same place*/
			if(rear == front) {
				rear = -1;
		        front = -1;
			}
			else {
				front = (front+1)%size;
			}
			return result;
			
		}
		
		//peek
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			return arr[front];
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queues q = new Queues(5);
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
			System.out.println(q.dequeue());
	       q.add(6);
	       System.out.println(q.dequeue());
	       q.add(7);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.dequeue();
		}
	}

}
