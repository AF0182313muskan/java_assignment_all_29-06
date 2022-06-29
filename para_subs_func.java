package Java_Practicals;

import java.util.Scanner;

public class para_subs_func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accept_sub() ;
	}
    public static void accept_sub() {
    	Scanner sc = new Scanner(System.in);
    	int num1,num2;
    	System.out.println("Enter two numbers");
    	num1= sc.nextInt();
    	num2 = sc.nextInt();
    	sub(num1,num2);
        }
    public static void sub(int num1, int num2) {
    	int res;
    	res = num1-num2;
    	System.out.println("The substraction of two no is = : "+res);
}
}













