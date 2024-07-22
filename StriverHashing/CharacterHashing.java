package StriverHashing;

import java.util.Scanner;

public class CharacterHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		String s;
		s = sc.next();
		
		//precompute
		int[] hash = new int[26];
		for(int i=0;i<s.length();i++) {
			//it will give you index
			char ch = s.charAt(i);
			hash[ch -'a']++;
		}
		
		int q;
		q = sc.nextInt();
		while(q-- >0) {
			char c;
			c = sc.next().charAt(0);
			
			//fetch
			if(c>='a' && c<='z') {
				System.out.println(hash[c -'a']);			
			}
			else {
				System.out.println("Invalid input. Please enter a lowercase English alphabet.");			
			}
		}

	}

}
