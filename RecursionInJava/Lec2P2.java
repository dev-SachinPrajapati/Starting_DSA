package RecursionInJava;
import java.util.Scanner;

public class Lec2P2 {
	public void func(int i,int n) {
		if(i<1) {
			return;
		}
		System.out.println(i);  //Problem 3
		func(i-1,n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		Lec2P2 l2 = new Lec2P2();
		l2.func(n,n);
	}

}
