package Java_Practicals;

import java.util.Scanner;

public class Assignment_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num1 = sc.nextInt();
		num2=num1;
		System.out.println("The num is=" +num2);
		num2+=num1;
		System.out.println("The num is=" +num2);
		num2-=num1;
		System.out.println("The num is=" +num2);
		num2*=num1;
		System.out.println("The num is=" +num2);
		num2/=num1;
		System.out.println("The num is=" +num2);
		num2%=num1;
		System.out.println("The num is=" +num2);
		

	}

}
