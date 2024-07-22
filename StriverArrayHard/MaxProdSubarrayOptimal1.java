package StriverArrayHard;

public class MaxProdSubarrayOptimal1 {
	public static int subarrayWithMaxProduct(int []arr){
		int n = arr.length;
		int pre = 1,suff = 1;
		int result = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[n-i-1];
            result = Math.max(result, Math.max(pre, suff));
		}
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,-3,0,-4,-5};
		int answer = subarrayWithMaxProduct(nums);
		System.out.print("The maximum product subarray is: "+answer);

	}

}
