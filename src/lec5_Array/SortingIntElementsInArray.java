package lec5_Array;

import java.util.Arrays;

/* Sortin elements using for Loop.
 *   a[] = {50,20,40,100};
 */

public class SortingIntElementsInArray {

	public static void main(String[] args) {
		int a [] = {50,20,40,100};
		
		System.out.println("Here is the non-sorted Int elements in Array: " + Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("Here is the sorted Int elements in Array: " + Arrays.toString(a));
	}
}