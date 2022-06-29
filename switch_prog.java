package Java_Practicals;

import java.util.Scanner;

//no of month
public class switch_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("august");
			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("December");
			break;
			default :
				System.out.println("invalid month number");
		}


	}

}
