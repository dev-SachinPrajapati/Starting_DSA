package StriverArrayHard;

public class RepeatingandMissing {
			public static int[] repeatandmissing(int arr[], int n) {
				int missing = -1;
				int repeating  = -1;
				for(int i=0;i<n;i++) {
					int count = 0;
					for(int j=0;j<=n-1;j++) {
						if(arr[j] == i) {
							count++;
						}
					}
					if(count == 2) repeating = i;
					else if(count == 0) missing = i;
				
				if(repeating != -1 && missing != -1) break;
				}
				int[] ans = {repeating, missing};
		        return ans;
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {4,3,6,2,1,1,0};
			int n = arr.length;
			int []ans = repeatandmissing(arr,n);
			System.out.println("The repeating and missing numbers are: {" + ans[0] + ", " + ans[1] + "} ");
			
			//To check how many times number is repeating ans how many element is missing
			int repNumber = ans[0];
			int misNumber = ans[1];
			
			int repCount = 0;
			int misCount = 0;
			
			for(int i:arr) {
				if(repNumber == i) {
					repCount++;
				}
			}
			
			for(int i:arr) {
				if(misNumber == i) {
					misCount++;
				}
			}
			System.out.println("The repeating number is: " + repNumber + " (repeats " + repCount + " times)");
	        System.out.println("The missing number is: " + misNumber + " (missed " + misCount + " times)");
	    
	}

}
