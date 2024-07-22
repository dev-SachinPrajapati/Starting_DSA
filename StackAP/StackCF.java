package StackAP;

import java.util.*;

public class StackCF {

	public static void main(String[] args) {
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
