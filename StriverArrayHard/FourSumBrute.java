package StriverArrayHard;
import java.util.*;
public class FourSumBrute {
		public static List<List<Integer>> fourier(int arr[], int n,int target){
			Set<List<Integer>> st = new HashSet<>();
			for(int i=1;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					for(int k = j+1;k<n;k++) {
						for(int l = k+1;l<n;l++) {
							long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];

							if(sum == target) {
							List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
							Collections.sort(temp);
							st.add(temp);
							}
						}
					}
				}
			}
			
			
			List<List<Integer>> ans = new ArrayList<>(st);
			return ans;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
		int n = arr.length;
		int target = 9;
		List<List<Integer>> ans = fourier(arr,n, target);
		System.out.println("The quadruplets are: ");
		for(List<Integer> it:ans) {
			System.out.print("[");
			for(int i:it) {
				System.out.print(i + " ");
			}
			System.out.print("]");
		}
		System.out.println();

	}

}
