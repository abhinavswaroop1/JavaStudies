package lec4_Loops;

/*10. Write a program to find sum of all even numbers between 1 to n */

import java.util.Scanner;
public class SumOfAllEvenNumberBetween1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Last Digit Number till sum is needed: ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}     		
		}
		System.out.println("sum of all even numbers between 1 to " +  n + " is " + sum);
	}

}