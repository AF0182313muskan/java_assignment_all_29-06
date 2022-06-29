package Java_Practicals;

import java.util.Scanner;

//addition and swapping 
public class multilevel_inheritence {
 static Scanner sc = new Scanner(System.in);
  static int num1,num2,res,n1,n2,n3;

public static void add() {
	System.out.println("Enter two number");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	res= num1+num2;
	System.out.println("the addition of two no.is =" +res);
	
}
public static void swapping() {
	System.out.println("Enter two number");
     n1 = sc.nextInt();
     n2= sc.nextInt();
     System.out.println("before swapping the value "
     		+ "of n1 = :" +n1+" and  n2 is ="+n2);
     n3=n1;
     n1=n2;
     n2=n3;
     System.out.println("after swapping the value of "
     		+ "n1 = :" +n1+" and n2 is ="+n2);
     
}
}
