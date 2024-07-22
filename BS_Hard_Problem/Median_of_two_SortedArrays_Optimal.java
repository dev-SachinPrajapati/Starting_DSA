package BS_Hard_Problem;

public class Median_of_two_SortedArrays_Optimal {

	public static double median(int[] a, int[] b) {
		int n1 = a.length;
		int n2 = b.length;

		if (n1 > n2)
			return median(b, a);

		int n = n1 + n2;

		int left = (n1 + n2 + 1) / 2;

		int low = 0, high = n1;

		while (low <= high) {
			int mid1 = (low + high) / 2;
			int mid2 = left - mid1;

			// calculate l1, l2, r1 and r2;

			int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
			int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
			int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
			int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;
			
			
			if(l1 <= r2 && l2 <= r1) {
				if(n % 2 == 1) return Math.max(l1, l2);
				else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
			}
			else if (l1 > r2) high = mid1 -1;
			else  low = mid1 + 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 4, 7, 10, 12 };
		int[] b = { 2, 3, 6, 15 };
		System.out.println("The median of two sorted arrays is " + median(a, b));

	}

}
