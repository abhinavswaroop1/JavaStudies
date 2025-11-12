package lec5_Array;

import java.util.Arrays;

/* Find the largest number in Array. */

import java.util.Scanner;
public class LargestNumberInArray {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<=a.length-1;i++) {
			System.out.println("The Element at index " + i + " in Array is: " );
			a[i]=sc.nextInt();
		}
		System.out.println("The Array having elements is: " + Arrays.toString(a));
		
		//To find the largest number from the Array.
		//10,20,30,40,50
		
		int largest = a[0];
		int smallest = a[0];
		
		for(int i=1;i<=a.length-1;i++) {
			if(a[i] > largest) {
				largest=a[i];
			}
			else if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println("Largest is: "+ largest);
		System.out.println("Smallest is: "+ smallest);
		sc.close();
	}
}