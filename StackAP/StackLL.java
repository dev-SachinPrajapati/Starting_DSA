package StackAP;

public class StackLL {
	private static class Node{
		 Node next;
		 int data;
		 
		 Node(int data){
			 this.data = data;
			 next = null;
		 }
	}
	
	static class Stack{
		public static Node head =  null;
		public static void push(int data) {
			Node newNode = new Node(data);
			
			if(head == null) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		public static boolean isEmpty() {
			return head == null;
		}
		
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			
			Node top = head;
			head = head.next;
			return top.data;
		}
		
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			 Node top = head;
	         return top.data;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
		/*First 1 get stored then 2 then 3 then 4 and now 4 is head and after pop implement and remove 4 and now 3 is head and again pop implement and remove 3 and process goes on*/

	}

}
