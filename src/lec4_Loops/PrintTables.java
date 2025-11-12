package lec4_Loops;

/*3. Write a program to print tables */

import java.util.Scanner;
public class PrintTables {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you need a Table: ");
		int num = sc.nextInt();
		
		System.out.println("The Table of " + num + " is below: ");
		
		for(int i= 1; i<=10 ; i++) {
			
			System.out.println(num + "*" + i + "=" + num*i);
		}
		sc.close();
	}
}
