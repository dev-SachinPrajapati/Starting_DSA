package StackAP;

import java.util.Stack;
// (Push at Bottom of Stack)
public class StackP1 {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> s = new Stack<>();   //<> diamond operator
		s.push(1);
		s.push(2);
		s.push(3);
		
		
		pushatbottom(4,s);
		
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
