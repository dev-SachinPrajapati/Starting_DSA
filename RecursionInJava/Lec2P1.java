package RecursionInJava;
import java.util.*;
public class Lec2P1 {
		public void func(int i,int n) {
			if(i>n) {
				return ;
			}
//			System.out.print("My name is Sachin \n");  //Problem 1
			System.out.println(i);  //Problem 2
			func(i+1,n);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int n = sc.nextInt();
			
			Lec2P1 l2 = new Lec2P1();
			l2.func(1,n);
	}

}
