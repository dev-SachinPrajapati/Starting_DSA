package LinkedList;

//LinkedList class

class NodeDLL {
	int data;
	NodeDLL next;
	NodeDLL prev;
	
	// Constructor with both data and next pointer
	NodeDLL(int data, NodeDLL next, NodeDLL prev){
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	
	// Constructor with only data (next pointer set to null)
	NodeDLL(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLL {
	
	
	// 0. Array to DLL
	 public static NodeDLL constructDLL(int []arr) {
	        // Write your code here
		 NodeDLL head = new NodeDLL(arr[0]);
		 NodeDLL prev = head;
	        for (int i = 1; i < arr.length; i++) {
	        	NodeDLL temp = new NodeDLL(arr[i],null, prev);
	            prev.next = temp;
	            prev = temp;
	        }
	        return head;
	    }
	 
	 
	 
	 // 1. Deletion from head in DLL
	 public static NodeDLL deleteHead(NodeDLL head) {
	        // Write Your Code Here.
	        if(head == null || head.next == null){
	            return null;
	        }
	        NodeDLL prev = head;
	        head = head.next;

	        head.prev = null;
	        prev.next = null;

	        return head;
	    }
	 
	 
	 // 2. Deletion from tail in DLL
	 public static NodeDLL deleteTail(NodeDLL head) {
		 
		 if(head == null || head.next == null){
	            return null;
	        }
		 NodeDLL tail = head;
		 while(tail.next != null) {
			 tail = tail.next;
		 }
		 NodeDLL newTail = tail.prev;
		 newTail.next = null;
		 tail.prev = null;
		 return head;
	 }
	 
	 
	 // 3. Deletion the Kth element in DLL
	 public static NodeDLL deleteKthElement(NodeDLL head, int k) {
		 if(head == null) {
			 return null;
		 }
		 int cnt = 0;
		 NodeDLL kNode = head;
		 while(kNode != null) {
			 cnt++;
			 if(cnt == k) {
				 break;
			 }
			 kNode = kNode.next;
		 }		 
			 
			 NodeDLL prev = kNode.prev;
			 NodeDLL front = kNode.next;
			 
			 if(prev == null && front == null) {
				 return null;
			 }
			 else if(prev == null) {
				 return deleteHead(head);
			 }
			 else if(front == null) {
				 return deleteTail(head);
			 }
			 
			 prev.next = front;
			 front.prev = prev;
			 
			 kNode.next = null;
			 kNode.prev = null;
			 
		 return head;
	 }
	 
	 
	// 4. Deletion of a given node(!head) in DLL
	 public static void  deleteNode(NodeDLL head) {
	        // Write Your Code Here.
		 
		 NodeDLL prev = head.prev;
		 NodeDLL front = head.next;
		
		 // Check if the previous node is not null
		    if (prev != null) {
		        prev.next = front;
		    }

		    // Check if the next node is not null
		    if (front != null) {
		        front.prev = prev;
		    }
		 
		    // Update head.prev and head.next to null
		    head.prev = null;
		    head.next = null;
		 
	    }
	 
	 
	 //INSERTION
	 
		 // 1. Insertion before Head
		 public static NodeDLL insertBeforeHead(NodeDLL head, int val) {
			 
			 NodeDLL newHead = new NodeDLL(val,head, null);
			 head.prev = newHead;
			 return newHead;
		 }
		 
	 
	 // 2. Insertion Before tail
	 public static NodeDLL insertBeforeTail(NodeDLL head, int val) {
		 
		 if(head.next == null) {
			 return insertBeforeHead(head,val);
		 }
		 NodeDLL tail = head;
		 while(tail.next != null) {
			 tail = tail.next;
		 }
		 
		 NodeDLL prev = tail.prev;
		 NodeDLL newNode = new NodeDLL(val,tail, prev);
		 prev.next = newNode;
		 tail.prev = newNode;
		 
		 return head;
	 }
	 
	 
	 // 3. Insertion before Kth Position
	 public static NodeDLL insertBeforeKthElement(int k, int val, NodeDLL head) {
	        // Write your code here.
		 	if(k == 1) {
		 		return insertBeforeHead(head,val);
		 	}
		 	NodeDLL temp = head;
		 	int cnt = 0;
		 	while(temp != null) {
		 		cnt++;
		 		if(cnt == k) break;
		 		temp = temp.next;
		 	}
		 	NodeDLL prev = temp.prev;
		 	NodeDLL newNode  = new NodeDLL(val, temp, prev);
		 	prev.next = newNode;
		 	temp.prev = newNode;
		 	return head;
	    }
	 
	 
	// Function to print the linked list
    private static void printLL(NodeDLL head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 5, 8, 7};
		NodeDLL head = constructDLL(arr);
        
		 // 1. Deletion from head in DLL
		// head = deleteHead(head);
		
		// 2. Deletion from tail in DLL
		//head = deleteTail(head);
		
		// 3. Deletion the Kth element in DLL
		// head = deleteKthElement(head,3);
		
		// 4. Deletion of a given node(!head) in DLL
		//deleteNode(head.next);
		
		
		//1. Insert Before head
		//head = insertBeforeHead(head,10);
		
		//2. Insert Before tail
		head = insertBeforeTail(head,10);
		
		//3. Insert Before kth element
		head = insertBeforeKthElement(4,20,head);
		
		//4. Insert Before Node
		
		
		
        // Print the modified linked list
        printLL(head);
	}

}
