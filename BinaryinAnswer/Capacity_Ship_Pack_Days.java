package BinaryinAnswer;

public class Capacity_Ship_Pack_Days {
	
	public static int findDays(int []weight, int capacity) {
		int days = 1, load = 0;
		int n = weight.length;
		
		for(int i=0;i<n;i++) {
			if(load + weight[i] > capacity) {
				days = days + 1;
				load = weight[i];
			}
			else {
				load += weight[i];
			}
		}
		return days;
	}

	public static int leastWeightCapacity(int []weights, int d) {
		 //Find the maximum and the summation:
		int maxi = Integer.MIN_VALUE, sum = 0;
		for(int i=0;i<weights.length;i++) {
			sum += weights[i];
			maxi = Math.max(maxi, weights[i]);
		}
		
		for(int i=maxi;i<sum;i++) {
			if(findDays(weights, i) <= d) {
				return i;
			}
		}
		
		 //dummy return statement:
        return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = leastWeightCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);

	}

}
