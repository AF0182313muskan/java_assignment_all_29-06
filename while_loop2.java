package Java_Practicals;

import java.util.Scanner;

//wap to accept a no from user and display factorial
public class while_loop2 {
//priti miss
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,f=1;
		System.out.println("Enter a number");
		num = sc.nextInt();
		while (num>0) {
			f=f*num;
		    num--;
		}
		System.out.println("The factorial is ="+f);
		
				
	//google
		//int fact=1; 
	//	int i=1;
		//while(i<=num) {
			//fact = fact*i;
		//	i++;
		}
		//System.out.println("Factorial of " +num+ "is :"  +fact);
	}


