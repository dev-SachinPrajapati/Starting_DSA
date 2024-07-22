package QueueAP;

import java.util.*;
public class QueueCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Here we use LL beacause Queue is Interface so we can't make it object
		 * but we can access using LL or ArrayDeque
		 * Use any difference is on memory caches*/
		
//		Queue<Integer> q = new LinkedList<>(); 
		Queue<Integer> q = new ArrayDeque<>(); 
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
	    q.add(7);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}

}
