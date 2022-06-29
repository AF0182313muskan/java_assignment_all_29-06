package Java_Practicals;

import java.util.Scanner;

public class Armstrong_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, rem,sum=0,k;
		System.out.println("Enter a number");
		n = sc.nextInt();
		k =n;
		while(n>0) {
			rem = n%10;
			n=n/10;
			sum = sum+rem*rem*rem;
		}
		if(k==sum) {
			System.out.println("It is an armstrong no.");
		}
		else {
			System.out.println("It is not an armstrong no.");
		}

	}

}
