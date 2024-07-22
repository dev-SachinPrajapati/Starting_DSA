package QueueAP;

//Queue using Array
public class QueueArray {
		static class Queue{
			static int arr[];  //array
			static int size;  //to store size from Constructor
			static int rear; 
			Queue(int size){
				arr = new int[size];
				this.size = size;
				arr = new int[size];
				rear = -1;
			}
			
			public static boolean isEmpty() {
				return rear == -1;  //Queue khali hai
			}
			
			
			
			//enqueue
			public static void add(int data) {
				//Queue is full
				if(rear == size-1) {
					System.out.println("OverFlow");
					return;
				}
				arr[++rear] = data;
			}
			
			
			//dequeue
			public static int dequeue() {
				if(isEmpty()) {
					System.out.println("Empty Queue");
					return -1;
				}
				//front value we remove
				int front = arr[0];
				//piche sare index ke ek ek karke aage bhejo kyuki aage ka index khali hai
				for(int i=0;i<rear;i++) {
					arr[i] = arr[i+1];
				}
				rear--;     /*statement should added as we shifted all element to previous place so now our rear should also shift to its previous place*/
				return front;
				
			}
			
			//peek
			public static int peek() {
				if(isEmpty()) {
					System.out.println("Empty Queue");
					return -1;
				}
				return arr[0];
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.dequeue();
		}
		 
	}

}
