package Java_Practicals;
//wap to accept 4 no from the user and find out the greatest

import java.util.Scanner;

public class if_else_if_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4;
		System.out.println("Enter four numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		if(num1>num2 && num1>num3 && num1>num4)
		{
			System.out.println(num1+ " is greater than the other no"  );
		}
		else if(num2>num1 && num2>num3 && num2>num4  ) {
			System.out.println(num2+ " is greater than the other no" );
	       }
		else if(num3>num1 && num3>num2 && num3>num4  ) {
			System.out.println(num3+ " is greater than the other no");
	       }
		else 
		{
			System.out.println(num4+ " is greater than the other no" );
	       }
	

}
}
