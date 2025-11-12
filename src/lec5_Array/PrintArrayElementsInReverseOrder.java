package lec5_Array;

import java.util.Arrays;

public class PrintArrayElementsInReverseOrder {

	public static void main(String[] args) {
		
		int a[]= {12,25,85,66,33,02,67,68};
		
		System.out.println("Below are the Array Elements: " + Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("Below are the Sorted Array Elements: " + Arrays.toString(a));
		
		for(int i= a.length-1; i>=0;i--) {
			int rev = a[i];		
			System.out.println( rev);
		}
	}
}