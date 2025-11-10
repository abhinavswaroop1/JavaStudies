package lec4_Loops;

/*1. Write a program to print all natural numbers from 1 to n */

import java.util.Scanner;
public class PrintNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting number: ");
		int i = sc.nextInt();
		
		System.out.println("Enter the Ending number: ");
		int e = sc.nextInt();
		
		System.out.println("All the Natural numbers from " + i + " to " + e + " is:");
		
		while(i<=e) {
			System.out.println(i);
			i++;
		}
			  
		 }	
}