package Java_Practicals;
//globally
import java.util.Scanner;

public class Function_three_method {

	Scanner sc = new Scanner(System.in);
	int num1,num2,num3,f=1,num, rev=0,rem;;
	
	public  void greater() {
		
		
		System.out.println("Enter three number");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		if(num1>=num2) {
			System.out.println("the greater number is = "+num1);
		}
		else if(num2>=num1) {
			System.out.println("the greater number is = " +num2);
		}
		else if(num3>=num1) {
			System.out.println("the greater number is = "+num3);
		}
		
	}
	public  void fact() {
		int num1,f=1;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a no" );
		num1 = sc.nextInt();
		while(num1>0) {
			f= f*num1;
			num1--;
			
		}
		System.out.println("the factorial is =" +f);
	}
	public void reverse() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		while(num!=0) {
			rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("the reverse no is =" +rev);
	}
}







