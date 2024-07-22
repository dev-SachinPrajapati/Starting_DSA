package SortingInDSA;
import java.util.ArrayList;
import java.util.Collections;
public class Array_List_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Declare an ArrayList of different Types
			Add Element
			Get Element
			Add Element at a specific Index
			Set Element at a specific Index
			Delete Element from an Index
			Size of the List
			Loop/Iterate on the List
			Sort the List
			*/
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//add elements
		list.add(1);
		list.add(8);
		list.add(7);
		list.add(9);
		System.out.println("Added Elements: " + list);
		
		//to get an element
		int ele = list.get(1);
		System.out.println("Get element: " + ele);
		
		//add element in between
		list.add(1,6);// 1 is the index and 6 is the element to be added
		System.out.println("Add element in between: " + list);
		
		
		//set element
		list.set(0, 5);  // 0 is the index and 5 is the element to be set
		System.out.println("Set element: "+list);
		
		//delete element
		list.remove(0);  //0 is the index
		System.out.println("Remove element: "+list);
		
		//Size of element
		int sizes = list.size();
		System.out.println("Size of element: "+sizes);
		
		
		//Loops of list
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + "|");
		}
		System.out.println();
		 //Sorting the list
		list.add(1); //add 1 at 0 index
		Collections.sort(list);
		System.out.println(list);
	}

}
