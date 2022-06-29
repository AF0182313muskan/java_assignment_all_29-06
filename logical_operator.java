package Java_Practicals;

import java.util.Scanner;

public class logical_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		boolean res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		res=num1>num2 && num1!=num2;
		System.out.println("the result is" +res);
		res=num1>num2 || num1==num2;
		System.out.println("the result is" +res);

	}

}
