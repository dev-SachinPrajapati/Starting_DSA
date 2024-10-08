package BS_Hard_Problem;

import java.util.*;
public class Allocate_Book_Brute {
	
	public static int countStudents(ArrayList<Integer> arr, int pages) {
		int n = arr.size();
		int students = 1, pagesToStudents = 0;
		
		for(int i=0;i<n;i++) {
			if(pagesToStudents + arr.get(i) <= pages) {
				pagesToStudents += arr.get(i);
			}
			else {
				students++;
				pagesToStudents = arr.get(i);	
			}
		}
		return students;
	}

	public static int findPages(ArrayList<Integer> arr, int n, int m) {
		 // book allocation impossible
        if (m > n) return -1;
        
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        
        for(int pages = low; pages<=high;pages++) {
        	if(countStudents(arr,pages) == m) {
        		return pages;
        	}
        }
        return low;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24, 78));
        int n = arr.size();
        int m = 5;
        int ans = findPages(arr, n, m);
        System.out.println("The answer is: " + ans);

	}

}
