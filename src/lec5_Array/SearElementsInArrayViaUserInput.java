package lec5_Array;

import java.util.Arrays;

/* Search Element in Array using User Inputs*/

import java.util.Scanner;
public class SearElementsInArrayViaUserInput {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the value for position " + i + ": ");
			a[i]=sc.nextInt();
		}
		
		// This is to print the entered Array in Console.
		System.out.println("Enetred Array is : " + Arrays.toString(a));
		
		// Below part is to find the element from the above entered Array.
		
		System.out.println("Enter the Element you want to Search in the above Array: ");
		int seachElement = sc.nextInt();
		boolean status = false;
		
		for(int i=0; i<=a.length-1;i++) {
			if(seachElement==a[i]) {
				System.out.println("Element is found!");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("oh! Element not found.");
		}
		sc.close();
	}
}