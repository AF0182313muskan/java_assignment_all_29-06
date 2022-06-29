package Java_Practicals;

import java.util.Scanner;

public class Non_static_para_func {
;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_static_para_func obj = new Non_static_para_func();
		obj.accept();
		
		}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter two number");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		add(num1,num2);
		sub(num1,num2);
		mul(num1,num2);
		div(num1,num2);
		mod(num1,num2);
	}
      public void add(int num1, int num2) {
    	  int res;
    	  res= num1+num2;
    	  System.out.println("the addition of two no. is = " +res);
      
      }
      public void sub(int num1, int num2) {
    	  int res;
    	  res= num1-num2;
    	  System.out.println("the substraction of two no. is = " +res);
      }
      public  void mul(int num1, int num2) {
  		int res;
  		res = num1*num2;
  		System.out.println("the multiplication of two numbers is =" +res);
  	
  	}
  	public void div(int num1, int num2) {
  		int res;
  		res = num1/num2;
  		System.out.println("the division of two numbers is =" +res);
  	
  	}
  	public  void mod(int num1, int num2) {
  		int res;
  		res = num1%num2;
  		System.out.println("the modulus of two numbers is =" +res);
  	}

}
