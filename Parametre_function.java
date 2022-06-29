package Java_Practicals;
//addition
import java.util.Scanner;

public class Parametre_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parametrizedaccept();
		
	}
	public static void parametrizedaccept() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
	     System.out.println("Enter two numbers");
	     num1 = sc.nextInt();
	     num2 = sc.nextInt();
	     add(num1,num2);
	}
	public static void add(int num1, int num2) {
		int res;
		res = num1+num2;
		System.out.println("the addition of two numbers is =" +res);
	sub(num1,num2);
	}
	public static void sub(int num1, int num2) {
		int res;
		res = num1-num2;
		System.out.println("the substraction of two numbers is =" +res);
	mul(num1,num2);
	}
	public static void mul(int num1, int num2) {
		int res;
		res = num1*num2;
		System.out.println("the multiplication of two numbers is =" +res);
	div(num1,num2);
	}
	public static void div(int num1, int num2) {
		int res;
		res = num1/num2;
		System.out.println("the division of two numbers is =" +res);
	mod(num1,num2);
	}
	public static void mod(int num1, int num2) {
		int res;
		res = num1%num2;
		System.out.println("the modulus of two numbers is =" +res);
	}

}
