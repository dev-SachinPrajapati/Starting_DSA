package LinkedList;

//LinkedList class

class Node1 {
	int data;
	Node1 next;
	
	// Constructor with both data and next pointer
	Node1(int data, Node1 next){
		this.data = data;
		this.next = next;
	}
	
	
	// Constructor with only data (next pointer set to null)
	Node1(int data){
		this.data = data;
		this.next = null;
	}
}


public class InsertionInLL {
	
	// 1. Insertion at head
	public static Node1 insertAtFirst(Node1 head, int newValue) {
		// Write your code here
		Node1 temp = new Node1(newValue,head);
		return temp;
	}

	
	//2. Insertion at Tail
	public static Node1 insertAtLast(Node1 head, int newValue) {
		// Write your code here
		
		if(head == null) {
			return new Node1(newValue);
		}
		

		Node1 temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		Node1 newNode = new Node1(newValue);
		temp.next = newNode;
		
		return head;
	}

	
	// 3. Insertion at K Position
	public static Node1 insertAtK(Node1 head, int element, int k) {
		if(head == null) {
			// create new node, but only valid for k == 1
			// if nothing is there just return the head or null of LL
			if(k == 1) {
				return new Node1(element);
			}
			else {
				return head;  
			}
		}
		// if it state that position in ar 1st index 
		if(k == 1) {
			// head is now change to take new head
			return new Node1(element,head);
		}
		
		int cnt = 1;
		Node1 temp = head;
		while(temp != null) {
			cnt++;
			
			//to add new node, if my counter just behing k otherwise we just move to next again next
			if(cnt == (k - 1)) {
				// stop before kth element i.e temp
				// create new node, and then point temp to that new node -> and new node to next wala element of newNode
				Node1 x = new Node1(element, temp.next);
				// we can't directly break the chain after we create new node, otherwise the link will break, 
				// so to avoid that first we have to make link between new node (x) and temp.next, so after point temp to new node
				// and then break with the node where it point 
				temp.next = x;
				break;
			}
			
			temp = temp.next;
		}
		
		return head;
	}
	
	
	// 4. Insertion at before value
	// Explanation as the same as 3., but instead of cnt we used head.data
	public static Node1 insertAtBeforeValue(Node1 head, int element, int value) {
		if(head == null) {
			return null;
		}
		
		if(head.data  == value) {
			// head is now change to take new head
			return new Node1(element,head);
		}
		

		Node1 temp = head;
		while(temp.next != null) {
			
			//to add new node
			if(temp.next.data == value) {
				Node1 x = new Node1(element, temp.next);
				temp.next = x;
				break;
			}
			temp = temp.next;
		}
		
		return head;
	}
	
	
	
	// Function to print the linked list
    private static void printLL(Node1 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    } 
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 5, 8, 7};
		Node1 head = new Node1(arr[0]);
		head.next = new Node1(arr[1]);
        head.next.next = new Node1(arr[2]);
        head.next.next.next = new Node1(arr[3]);
       
        // 1. Insert from head of the linked list
//         head = insertAtFirst(head, 50);
         
         
         // 2. Insert from tail of the linked list
//         head = insertAtLast(head, 50);
         
         
         // 3. Insert from tail of the linked list
//         head = insertAtK(head, 100,1);
         
         // 3. Insert from tail of the linked list
         head = insertAtBeforeValue(head, 100,8);
         
         
         printLL(head);
		

	}

}
