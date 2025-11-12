package lec4_Loops;

/* 15. write a program to reverse the given Digits
 * 
 * ex: num = 123
 * 
 *rev = 321 
 * 
 *  */

import java.util.Scanner;
public class ReverseGivenDigits {

	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the digit you want to reverse: ");
		int num = sc.nextInt();
		int rev = 0;
		int rem = 0;
		
		while(num>0) {
          rem = num%10; //3,2,1
          rev = rev*10+rem; //3 , rev = 3
          num = num/10;
		}
		System.out.println(rev);
		sc.close();
		}
}