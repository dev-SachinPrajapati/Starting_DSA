package BS_Hard_Problem;

public class Mini_Max_Dist_GasStations_Brute {
	
	public static double minimiseMaxDistance(int []arr, int k) {
		int n = arr.length;
		int []howMany = new int[n-1]; // initial kitne ka array hoga
		
		 //Pick and place k gas stations:
		for(int gasStations = 1;gasStations <= k;gasStations++) {
			//Find the maximum section
            //and insert the gas station:
			
			double maxSection = -1;
			int maxIndex = -1;
			
			for(int i=0;i<n-1;i++) {
				double difference  = arr[i+1]  - arr[i];
				double sectionLength = difference / (double) (howMany[i] + 1);
				
				if(sectionLength > maxSection) {
					maxSection = sectionLength;	
					maxIndex = i;
				}
			}
			//insert the current gas station:
			howMany[maxIndex]++;
		}
		
		//Find the maximum distance i.e. the answer:
		double maxAns = -1;
		for(int i=0;i<n-1;i++) {
			double difference  = arr[i+1]  - arr[i];
			double sectionLength = difference / (double) (howMany[i] + 1);
			maxAns = Math.max(maxAns, sectionLength);
		}
		
		return maxAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr  = {4,6,10}; 
			int k = 4;
			double ans = minimiseMaxDistance(arr,k);
			System.out.println("The answer is: " + ans);
	}

}
