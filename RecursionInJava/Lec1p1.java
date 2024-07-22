package RecursionInJava;

//Recursion Example 1
public class Lec1p1 {
	int count = 1;

	public int print() {
		if (count == 4) {
			return count;
		}
		System.out.print("I am Recursion \n");
		count++;
		return print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec1p1 le = new Lec1p1();
		le.print();

	}

}
