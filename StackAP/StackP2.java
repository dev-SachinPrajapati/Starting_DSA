package StackAP;

import java.util.Stack;

//(Reverse a Stack)
public class StackP2 {
public static void pushatbottom(int data, Stack<Integer> s) {
		
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		//remove top and add 
		int top = s.pop();
		pushatbottom(data,s);
		s.push(top);
	}
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return ;
		}
		int top = s.pop();
		reverse(s);
		pushatbottom(top,s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Stack <Integer> s = new Stack<>();   //<> diamond operator
				s.push(1);
				s.push(2);
				s.push(3);
				s.push(4);
				while(!s.isEmpty()) {
					System.out.println(s.peek());
					s.pop();
				}

	}

}
