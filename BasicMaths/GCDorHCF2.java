package BasicMaths;

public class GCDorHCF2 {
	public int digit(int n1, int n2) {
		
		while(n1>0 && n2>0) {
			if(n1>n2) n1 = n1%n2;
			else n2 = n2%n1;
		}
		if(n1==0) {
		return n2;
		}
		return n2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCDorHCF cd = new GCDorHCF();
		int n1 = 9;
		int n2 = 12;
		cd.digit(n1,n2);

	}

}
