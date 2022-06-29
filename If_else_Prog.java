package Java_Practicals;
//wap no is not divisible by 7 than display cube 
import java.util.Scanner;

public class If_else_Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,res;
		System.out.println("Enter a number");
		num = sc.nextInt();
		if(num%10==0) {
			System.out.println("It is divisible by 10");
			res=num*num;
			System.out.println("Square of the no is : " +res);
		}
		else
		{
			System.out.println("It is not divisible by 10");
			res = num*num*num;
			System.out.println("cube of the no is : " +res);
		}

	}

}
