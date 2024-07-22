package StriverArrayHard;
import java.util.*;

public class MajorityElementBrute {
//Majority Element (n/3)
	
	public static List<Integer> major(int arr[]) {
		int  n = arr.length;
		List<Integer> ls = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(ls.size() == 0 || ls.get(0)!=arr[i]) {
				int count = 0;
				for(int j=0;j<n;j++) {
					if(arr[j] == arr[i]) {
					count++;
					}
				}
				if(count > (n/3)) {
					ls.add(arr[i]);
				}
			}
			
			if(ls.size() == 2) break;
		}
		return ls;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {1,1,1,2,2,2,3,3};
			List<Integer> ans = major(arr);
			 System.out.print("The majority elements are: ");
			for(int i=0;i<ans.size();i++) {
				System.out.print(ans.get(i) + " ");
			}
			System.out.println();
			
	}

}
//Output is 1 2 
