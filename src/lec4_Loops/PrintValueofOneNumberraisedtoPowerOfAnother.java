package lec4_Loops;

/*14. Write a program to find the value of one number raised to the power of another 
 * 
 * ex: 3(3) = 3x3x3 = 27
 * 
 * */

import java.util.Scanner;
public class PrintValueofOneNumberraisedtoPowerOfAnother {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base Number: ");
		int baseNum = sc.nextInt();
		
		System.out.println("Enter the number used as a power for baseNum: ");
		int powNum= sc.nextInt();
		
		int val = 1;
		
		for(int i = 1; i <= powNum ; i++) {
			val=val*baseNum;
		}
		System.out.println("The value of " + baseNum + " raised to the power of " + powNum + " is: " + val);
		sc.close();
	}
}