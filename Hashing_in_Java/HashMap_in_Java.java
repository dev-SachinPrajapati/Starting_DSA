package Hashing_in_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_in_Java {

	public static void main(String[] args) {
		// Creating HashMap
		// country(key) , population(value)
		HashMap<String, Integer> map = new HashMap<>();
		
		//Insetion
		
		map.put("India", 150);
		map.put("US",30);
		map.put("Russia", 50);
		
		System.out.println(map);
		
		//update value
		map.put("Russia", 150);
		System.out.println(map);
		
		
		//Searching
		if(map.containsKey("US")) {
			System.out.println("Yes!! China is there");
		}
		else {
			System.out.println("No!! China is there");
		}
		
		System.out.println(map.get("US")); //key exist
		System.out.println(map.get("France")); //key doesn't exist
		
		
		
		//Iteration in HashMap	 
		
		/*Regular Method for Iteration*/
		int arr[] = {12,45,78};
		for(int i=0;i<3;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for(int val:arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		//Iterator Method through entrySet()
		//for(int val:arr)
		for(Map.Entry<String, Integer> e: map.entrySet()) {
			System.out.print(e.getKey()+":");
			System.out.print(e.getValue() + " ");
		}
		System.out.println();
		//Iterator Method through Set()
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(key+ " " + map.get(key));
		}
		
		
		//remove
		map.remove("US");
		System.out.println(map);
		
		
		
		
		
	}
	

}
