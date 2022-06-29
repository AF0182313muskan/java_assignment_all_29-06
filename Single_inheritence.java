package Java_Practicals;

import java.util.Scanner;

public class Single_inheritence {
	static Scanner sc = new Scanner(System.in);
	static int n,r,s=0,m;
	
 public static void Palindrome() {
	 System.out.println("Enter a number");
		n = sc.nextInt();
		m=n;
		while (n>0) {
			r=n%10;
			s= s*10+r;
			n=n/10;
		}
		if(m==s) {
			System.out.println("it is a palindrome no.");
		}
		else {
			System.out.println("it is not an palindrome no.");
		}

 }
}


