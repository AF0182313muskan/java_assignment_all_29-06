package Java_Practicals;

import java.util.Scanner;

public class Ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		num = sc.nextInt();
		int res;
		res = (num%2==0)?num*num : num*num*num;
		System.out.println("the result is =" +res);
		

	}

}
