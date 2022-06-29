package Java_Practicals;

import java.util.Scanner;

//swap the two numbers
public class Function_Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap();

	}
     public static void swap() {
    	  Scanner sc = new Scanner(System.in);
    	  int num1 , num2 , num3;
    	 
    	  System.out.println("enter two number");
	      num1 = sc.nextInt();
	      num2= sc.nextInt();
	      System.out.println("before swapping the value "
	      		+ "of num1 = :" +num1+" and num 2 is ="+num2);
	      num3=num1;
	      num1=num2;
	      num2=num3;
	      System.out.println("after swapping the value of "
	      		+ "num1 = :" +num1+" and num 2 is ="+num2);
	      
	 
     
	 
	 
	 }
}
