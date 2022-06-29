package Java_Practicals;

import java.util.Scanner;

public class Arithmetic_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,add,sub,mul,div,mod;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		num1=sc.nextInt();
		num2=sc.nextInt();
	
		add = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		mod = num1%num2;
		System.out.println("the add of two number :" +add);
		System.out.println("the add of two number :" +sub);
		System.out.println("the add of two number :" +mul);
		System.out.println("the add of two number :" +div);
		System.out.println("the add of two number :" +mod);
		
		

	}

}
