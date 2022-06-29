package Java_Practicals;

import java.util.Scanner;

//wap to accept a no from the user and if no is divisible by 7 than 
// display the square
public class If_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, res;
		System.out.println("enter a number");
		num = sc.nextInt();
		if(num%7==0) 
		{
			System.out.println("Number is divisible by 7");
			res = num*num;
			System.out.println("Square of number is :" +res);
		}
		

	}

}
