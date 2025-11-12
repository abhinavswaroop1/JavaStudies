package lec4_Loops;

/*2. Write a program to print all natural numbers in reverse */

import java.util.Scanner;
public class PrintReverseNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last Natural number: ");
		int l = sc.nextInt();
		
		System.out.println("Enter the first Natural number: ");
		int f = sc.nextInt();
		
		System.out.println("All the Natural numbers from" + l +" to " + f + " in reverse order is: ");
		
		while(l>=f) {
			System.out.println(l);
			l--;
		}
		sc.close();
	}

}
