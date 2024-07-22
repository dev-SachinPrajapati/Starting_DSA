package Hashing_in_Java;
import java.util.*;
public class HashMapImplement {
	
	//<>-Angular Bracket 	K= Key, V= Value
		static class HashMap<K,V>{ //generic:- General Types(String, int etc)
			//linkedList Node Structure
			private  class Node {
				K Key;
				V Value;
				
				public Node(K Key, V Value) {
					this.Key = Key;
					this.Value = Value;
				}
			}
			
			//Some Variables
			private int n; //nodes
			private int N; //bucket
			
			//This is Like
			private LinkedList<Node> buckets[]; //N bucket.length
		//  private   int             arr[];
			

			public HashMap() {
				this.N = 4;
				this.buckets = new LinkedList[4];
				//create empty space in LL because if there is no index so where we store our value and at this index we have null value
				for(int i=0;i<4;i++) {
					this.buckets[i] = new LinkedList<>();
				}
			}
			
			private int hashFunctions(K key) { // 0 to n-1
				int bucket_index = key.hashCode();
				//Hashcode return + or - value So to get + index we use Math.abs 
				return Math.abs(bucket_index) % N;  //To get index between 0 to n-1
				
			}
			private int searchLL(K Key, int bucket_index) {
				LinkedList<Node> ll = buckets[bucket_index]; //create LinkedList
				for(int i=0;i<ll.size(); i++) {
					if(ll.get(i).Key == Key) {  //if our key matches to exited key
						return i;
					}
				}
				return -1; //if key doesn't match to our key
			}
			private void rehash(){
				LinkedList<Node> oldbucket[] = buckets;  //old data ko oldbucket me store kiya
				buckets = new LinkedList[N*2];  //Create empty bucket
				
				//It has null value in buckets so we have to create null LinkedList
				for(int i=0;i<N*2;i++) {
					buckets[i] = new LinkedList<>();
				
				}
				
				 for(int i=0;i<oldbucket.length;i++) {  
					 LinkedList<Node> ll = oldbucket[i];
					 for(int j=0;j<ll.size();j++) {
						 Node node = ll.get(j);
						 put(node.Key, node.Value);
					 }
				 }
			}
			
			public void put(K Key, V Value) {
				int bucket_index = hashFunctions(Key); // TO know index of Array
				int data_index  = searchLL(Key, bucket_index);    // To know the index of LinekdList   
				/*If data_index = -1 means data index doesn't exist*/
				
				if(data_index == -1) {  //key doesn't exist
					buckets[bucket_index].add(new Node(Key,Value)); //To add new Node
				}
				else { //key exist
					 Node node = buckets[bucket_index].get(data_index);  //To get exist data
						node.Value = Value;  //Update value
				}
			
				//lambda
			double lambda = (double)n/N;
			if(lambda >2.0) {
				//rehashing
				rehash();
			}	
		}

		
			
		public boolean containKey(K Key) {
			int bucket_index = hashFunctions(Key); // TO know index of Array
			int data_index  = searchLL(Key, bucket_index);    // To know the index of LinekdList   
			/*If data_index = -1 means data index doesn't exist*/
			
			if(data_index == -1) {  //key doesn't exist
				return false;
			}
			else { //key exist
				return true;
			}
		}
		
		public V remove(K Key) {
			int bucket_index = hashFunctions(Key); // TO know index of Array
			int data_index  = searchLL(Key, bucket_index);    // To know the index of LinekdList   
			/*If data_index = -1 means data index doesn't exist*/
			
			if(data_index == -1) {  //key doesn't exist
				return null;
			}
			else { //key exist
				 Node node = buckets[bucket_index].remove(data_index);  //To get exist data
				 n--; //LL remove hoga to node kam hote jayega
				return node.Value;
			}
		}
		public V get(K Key) {
			int bucket_index = hashFunctions(Key); // TO know index of Array
			int data_index  = searchLL(Key, bucket_index);    // To know the index of LinekdList   
			/*If data_index = -1 means data index doesn't exist*/
			
			if(data_index == -1) {  //key doesn't exist
				return null;
			}
			else { //key exist
				 Node node = buckets[bucket_index].get(data_index);  //To get exist data
					return node.Value;
			}
		}
		
		public ArrayList<K> keyset(){
			ArrayList<K> keys  = new ArrayList<>();
			
			for(int i=0;i<buckets.length;i++) { //bucket list
				LinkedList<Node> ll  = buckets[i];
				for(int j=0;j<ll.size();j++) {
					Node node = ll.get(j);
					keys.add(node.Key);
				}
			}
			return keys;
		}
		
		public boolean isEmpty() {
			return n == 0;
		}
	}
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<String, Integer> map = new HashMap<>();  //This is not java inbuild this is class which we created at top
			map.put("India", 150);
			map.put("US", 30);   
			map.put("Russia", 10);
			
			
			ArrayList<String> keys = map.keyset();
			for(int i=0;i<keys.size();i++) {
							//		for key				for value
				System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
				
			}
			
			map.remove("India");
			System.out.println(map.get("India"));
			//TC of put() is O(Lambda) and wrost case O(N);
	}

}
