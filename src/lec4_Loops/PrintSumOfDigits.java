package lec4_Loops;

/*16. write a program to sum of its Digits
 * Ex.: 45 = (4+5)9
 */

import java.util.Scanner;
public class PrintSumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Digit for which you want Sum of it: ");
		int num = sc.nextInt();  //45
		int sum = 0;
		
		while(num>0) {
		    int rev = num%10; //5 , 4
			sum = sum+rev; //5 , 9
			num/=10;
		}
		System.out.println("Sum of its Digits is: " + sum);
	}
}