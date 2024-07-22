package StriverArray;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * The getOrDefault method is a useful feature provided by the Java Map interface (and its implementing classes like HashMap, LinkedHashMap, etc.). 
 * It allows you to retrieve the value associated with a given key from the map, but if the key is not present in the map, it returns a default value that you specify. 
 * This can be particularly helpful in cases where you want to avoid null checks and provide a default value instead.
 * Syntax:
 * V getOrDefault(Object key, V defaultValue)
 * key: The key whose associated value is to be retrieved.
 * defaultValue: The value to be returned if the key is not found in the map.
 * 
 * Example:
 * import java.util.HashMap;
	import java.util.Map;
	
	public class GetOrDefaultExample {
    	public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        
        scores.put("Alice", 95);
        scores.put("Bob", 85);
        
        String studentName = "Alice";
        int aliceScore = scores.getOrDefault(studentName, 0); // Get Alice's score or 0 if not found
        System.out.println(studentName + "'s score: " + aliceScore);
        
        studentName = "Charlie";
        int charlieScore = scores.getOrDefault(studentName, 0); // Get Charlie's score or 0 if not found
        System.out.println(studentName + "'s score: " + charlieScore);
    }
}

		OUTPUT:
		Alice's score: 95
		Charlie's score: 0

 * 
 * */
public class ArrayP9Brute1 {
	public static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {

		HashMap<Integer, Integer> freq = new HashMap<>();
		ArrayList<Integer> union = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			freq.put(arr1[i], freq.getOrDefault(arr1[i] + 1, 0) + 1);
		}
		for (int i = 0; i < m; i++) {
			freq.put(arr2[i], freq.getOrDefault(arr2[i] + 1, 0) + 1);
		}

		for (int it : freq.keySet()) {
			union.add(it);
		}
		return union;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, m = 7;
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
		ArrayList<Integer> union = FindUnion(arr1, arr2, n, m);
		System.out.println("Union of arr1 and arr2 is ");
		for (int val : union)
			System.out.print(val + " ");
	}

}
