package lec4_Loops;

/*4. Write a program to print reverse tables  */

import java.util.Scanner;
public class PrintReverseTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you need a Table: ");
		int num = sc.nextInt();
		
		System.out.println("The Table of " + num + " in reverse order is below: ");
		
		for(int i= 10 ; i>=1 ; i--) {
			
			System.out.println(num + "*" + i + "=" + i*num);
			
		}
		

	}

}
