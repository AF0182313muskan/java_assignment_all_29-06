package Java_Practicals;

import java.util.Scanner;

public class Class_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function_three_method obj = new
				Function_three_method();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("enter 1 for greater no");
		System.out.println("enter 2 for factorial ");
		System.out.println("enter 3 for reverse");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			obj.greater();
			break;
		case 2:
			obj.fact();
			break;
		case 3:
			obj.reverse();
			break;
		}
			
	}

}
