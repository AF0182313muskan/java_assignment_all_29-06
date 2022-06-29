package Java_Practicals;

import java.util.Scanner;

//wap to implement the constructor to find the 1)factorial no 
//2) displaY the no from mini to max
public class Constructor {

	Scanner sc = new Scanner(System.in);
 int num1, f=1,min,max;
 
public  Constructor() {
	System.out.println("enter a no" );
	num1 = sc.nextInt();
	while(num1>0) {
		f= f*num1;
		num1--;
		
	}
	System.out.println("the factorial is =" +f);
} 
public Constructor(int min, int max)
{
    while(max>=min) {
    	System.out.println(min);
    	min++;
    }
	}
}

