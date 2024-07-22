package BS_Hard_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Allocate_Book_Optimal {
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
        // Write your code here.
         // book allocation impossible
        if (m > n){
            return -1;
        } 
        
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();

        while(low<=high){
            int mid = (low + high)/2;
            int students = countStudents(arr, mid);
            if(students > m){
                low = mid + 1;  //students jyada hai
            }
            else {
                high = mid - 1; // Try to minimize the pages
            }

        }
        return low;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24, 78));
        int n = arr.size();
        int m = 5;
        int ans = findPages(arr, n, m);
        System.out.println("The answer is: " + ans);


	}

}
