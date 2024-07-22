package Pa;
import java.util.Scanner;

public class P2 {
	static void pattern1(int n){
		for(int i=0; i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// 
		System.out.println("Enter the Number till you want to see Pattern: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        pattern1(n);
        sc.close();
		

	}

}
