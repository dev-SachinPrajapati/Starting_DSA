package LinkedList;

import java.util.Stack;

//Optimal solution on Coding Ninjas Studio
//https://takeuforward.org/data-structure/reverse-a-doubly-linked-list/
//https://www.codingninjas.com/studio/problems/reverse-a-doubly-linked-list_1116098?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//Reverse a Node

class NodeR {
	public int data;
	public NodeR next;
	public NodeR prev;

	public NodeR(int data1, NodeR next1, NodeR prev1) {
		data = data1;
		next = next1;
		prev = prev1;
	}

	// Constructor for a Node with data,
	// and no references to the next and
	// previous nodes (end of the list)
	public NodeR(int data1) {
		data = data1;
		next = null;
		prev = null;
	}

}

public class ReverseDLL {

	// 0. Array to DLL
	public static NodeR constructDLL(int[] arr) {
		// Write your code here
		NodeR head = new NodeR(arr[0]);
		NodeR prev = head;
		for (int i = 1; i < arr.length; i++) {
			NodeR temp = new NodeR(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}
		return head;
	}

	private static NodeR reverseDLL(NodeR head) {
		// Creating Stack
		Stack<Integer> st = new Stack<>();
		// Initialise the node pointer temp at head
		NodeR temp = head;
		while (temp.next != null) {
			st.push(temp.data);
			temp = temp.next;
		}

		// Reinitialise temp to head
		temp = head;
		while (temp.next != null) {
			temp.data = st.pop();
			temp = temp.next;
		}

		return head;
	}

	// Function to print the linked list
	private static void printLL(NodeR head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 5, 8, 7};
		NodeR head = constructDLL(arr);
		System.out.println("Doubly Linked List Initially: ");
		printLL(head);
		
		System.out.println();
		System.out.println("Doubly Linked List After Reversing :");
		head = reverseDLL(head);
		printLL(head);
		

	}
}