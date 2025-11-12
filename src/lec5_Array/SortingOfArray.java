package lec5_Array;

import java.util.Arrays;

// Sorting Elements present in Array.

public class SortingOfArray {

	public static void main(String[] args) {
		
		int a[]= {12,25,85,66,33,02,67,68};
		
		System.out.println("Below is the Non-Sorted Array: " + Arrays.toString(a));
		
		//To Sort Array a method .sort is used which is predefined in class Arrays.
		Arrays.sort(a);
		
		System.out.println("Below is the Non-Sorted Array: " + Arrays.toString(a));
	}
}