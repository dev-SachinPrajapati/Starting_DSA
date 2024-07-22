package QueueAP;

import QueueAP.Circular_Queue.Queues;

public class QueueLL {
	static class Queues{
		static class Node{
			int data;
			Node next;
			
			Node(int data){
				this.data = data;
				next = null;
			}
		}
		
		static class Queue{
			static Node head = null;
			static Node tail = null;
		
		public static boolean isEmpty() {
			return head == null && tail == null;  //Queue khali hai
		}
		
		
		//enqueue
		public static void add(int data) {
				Node newNode = new Node(data);
				if(isEmpty()) {
					tail = head = newNode;
				}
				else {
					tail.next = newNode;
					tail = newNode;
				}
		}
		
		
		//dequeue
		public static int dequeue() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			
			int front = head.data;
			/*If we remove single element then Front and rear come at same place*/
			if(head == tail) {
				tail = null;
			}
			head = head.next;
			return front;	
		}
		
		//peek
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			return head.data;
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLL.Queues.Queue q = new QueueLL.Queues.Queue();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
	    q.add(7);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.dequeue();
		}
	}

}
