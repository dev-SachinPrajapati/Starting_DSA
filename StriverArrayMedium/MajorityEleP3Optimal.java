package StriverArrayMedium;

public class MajorityEleP3Optimal {

	//Moore's Voting Algorithm
	public static int majorityEle(int arr[]) {
		int n = arr.length;
		int count = 0;
		int element=0;
		
		 //applying the algorithm:
		for(int i=0;i<n;i++) {
			 if(count == 0) {
				 //Checking the Starting of new Section
				 count = 1;
				 element = arr[i];
			 }
			 //
			 else if(element == arr[i]) {
				 count++;
			 }
			 else {
				 count--;
			 }
		}
		int count1 = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] == element) count1++;
		}
		if(count1 >n/2) {
			return element;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityEle(arr);
        System.out.println("The majority element is: " + ans);
		
	}

}
