package StriverArray;

//Find the number that appear once and other number twice
public class Arrayp13OptimalXOR {
		public static int numOnce(int arr[]) {
			int XOR = 0;
			for(int i=0;i<arr.length;i++) {
				XOR = XOR^arr[i];
			}
			return XOR;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,3,3,4,4};
		
		System.out.println(Arrayp13OptimalXOR.numOnce(arr));
		// 2
	}

	//TC:- O(N)
	//SC:- O(1)
}
