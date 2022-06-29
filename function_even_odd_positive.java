package Java_Practicals;

import java.util.Scanner;

public class function_even_odd_positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenodd();
		positive_negative();

	}
	public static void evenodd() {
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Enter a number");
		num1 = sc.nextInt();
		
		if (num1%2==0) {
			System.out.println("it is an even number");
		}
		else {
			System.out.println("it is an odd number");
		}
		
	}
	public static void positive_negative()
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num = sc.nextInt();
		if(num>0) {
			System.out.println("It is a positive number");
		}
		else if(num==0){
			System.out.println("It is an Neutral number");
		}
		else{
			System.out.println("It is a negative number");
		}
		
	}
	
	

}

