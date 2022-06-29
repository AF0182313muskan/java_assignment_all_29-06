package Java_Practicals;

import java.util.Scanner;

public class for_loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min, max;
		System.out.println("Enter a minimum number");
		min = sc.nextInt();
		System.out.println("Enter a maximum number");
		max = sc.nextInt();
		for(int i = min; i<=max; i++)
		{
			System.out.println(i);
		}


	}

}
