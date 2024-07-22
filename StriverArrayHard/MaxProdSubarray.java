package StriverArrayHard;

public class MaxProdSubarray {
	   public static int subarrayWithMaxProduct(int []arr){
	        // Write your code here.
	        int result = arr[0];
	        for (int i = 0; i < arr.length-1; i++){
	            int prod = arr[i];
	            for (int j = i+1; j < arr.length; j++) {
	                result = Math.max(result, prod);    
	                prod *=  arr[j];
	            }
	                result = Math.max(result, prod);    
	            
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
