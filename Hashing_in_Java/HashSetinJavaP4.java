package Hashing_in_Java;

import java.util.HashMap;

public class HashSetinJavaP4 {
	public static String getstart(HashMap<String, String> tick) {
		HashMap<String, String> revmap = new HashMap<>();
		
		//Reverse from --> to
		for(String key:tick.keySet()) {
			//key- key   val- tick.get(key)
			//Now to make reverse we will convert key into value
			revmap.put(tick.get(key), key);
		}
		
		//To find starting point and it confirmed this will have one starting point
		for(String key: tick.keySet()) {
			if(!revmap.containsKey(key)) {
				return key;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> tickets = new HashMap<>();
		tickets.put("Chennai", "Bengaluru");
		tickets.put("Mumbai", "Delhi");
		tickets.put("Goa", "Chennai");
		tickets.put("Delhi", "Goa");
		
		String start = getstart(tickets);
		
		while(tickets.containsKey(start)) {
			System.out.println(start);
			start = tickets.get(start);
		}
		System.out.println(start);
	}

}
