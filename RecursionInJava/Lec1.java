package RecursionInJava;

//Infinite Recursion
public class Lec1 {
	public void print() {
		System.out.println(1);
			print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Lec1 l = new Lec1();
			l.print();
	}

}
