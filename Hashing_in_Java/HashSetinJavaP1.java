package Hashing_in_Java;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetinJavaP1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Please see ArrayList in Sorting Packages
	/*A HashSet is a data structure that represents a collection of unique elements in computer programming.*/
		HashSet<Integer> set = new HashSet<>();
		
		set.add(5);
		set.add(7);
		set.add(4);
		set.add(5);  //It doesn't allow Duplicate value
		set.add(9);
		set.add(4);
		System.out.println(set);
		
		//Size
		System.out.println("Size of Set: "+ set.size() );
		
		
		//Search
		if(set.contains(5)) {
			System.out.println("It contain 5");
		}
		if(!set.contains(2)) {
			System.out.println("It doesn't contain 2");
		}
		
		//Delete 
		set.remove(5);
		if(!set.contains(5)) {
			System.out.println("It doesn't contain 5 and we delete 5");
		}
//		else {
//			System.out.println("It does contain");
//		}
		
		//Iterator
		Iterator it  = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ ", ");
		}
		System.out.println();
		
		
		//isEmpty
		if(!set.isEmpty()) {
			System.out.println("Set is not Empty");
		}
		
		
		
		
	}

}
