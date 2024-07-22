package LinkedList;

//LinkedList class

class Node {
	int data;
	Node next;
	
	// Constructor with both data and next pointer
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
	
	
	// Constructor with only data (next pointer set to null)
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class DeletetionInLL {

	
	//1. Remove from Head
	public static Node removeHead(Node list){
        // Write your code here

        if(list == null){
            return list;
        }
        Node temp = list;
        list = list.next;
        return list;
    }
	
	
	//2. Remove from Tail
	 public static Node deleteLast(Node list){
	        // Write your code here

	        if(list == null || list.next == null){
	            return null;
	        }

	        Node temp = list;

	        while (temp.next.next != null) {
	            temp = temp.next;
	        }

	        temp.next = null;
	        return list;
	    }
	 
	 
	 //3. Delete Position   (by k)
	 public static Node deleteK(Node head, int k){
		
		 if(head == null) return null;
		 
		 if(k == 1) {
			 Node temp = head;
			 head = head.next;
		 }
		 
		 int count = 0;
		 Node temp = head;
		 Node prev = null;
		 
		 //Traverse 
		 while(temp != null) {
			 count++;
			 
			 if(count == k) {
				 prev.next = prev.next.next;
				 //Here memory get free if node didn't have any reference
				 break;
			 }
			 prev = temp;  // To have record of previous
			 temp = temp.next;
		 }
		 
		 return head;
	 }
	 
	
	 
	 //3. Delete Position   (by k)
	 public static Node deleteValue(Node head, int element){
		
		 if(head == null) return null;
		 
		 if(head.data == element) {
			 Node temp = head;
			 head = head.next;
		 }
		 
		 Node temp = head;
		 Node prev = null;
		 
		 //Traverse 
		 while(temp != null) {
			
			 
			 if(temp.data == element) {
				 prev.next = prev.next.next;
				 //Here memory get free if node didn't have any reference
				 break;
			 }
			 prev = temp;  // To have record of previous
			 temp = temp.next;
		 }
		 
		 return head;
	 }
	
	// Function to print the linked list
    private static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    } 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 5, 8, 7};
		Node head = new Node(arr[0]);
		head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
       
        // 1. Delete the head of the linked list
       //  head = removeHead(head);
        
       // 2. Delete the head of the linked list
       // head = deleteLast(head);
        
        // 3. Delete the head of the linked list
       // head = deleteK(head, 3);
        
        
        // 4. Delete the head of the linked list
        head = deleteValue(head, 8);
        
        // Print the modified linked list
        printLL(head);
		}
	}
