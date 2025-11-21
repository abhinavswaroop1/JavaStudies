package lec5_Array;

import java.util.Arrays;

/*Input: arr[] = {1, 14, 2, 16, 10, 20}
Output: 14


Input: arr[] = {19, -10, 20, 14, 2, 16, 10}
Output: 16

*/


public class ThirdLargestNumberInElement {

	public static void main(String[] args) {
		int a [] ={1, 14, 2, 16, 10, 20};
		
		int b[] = {19, -10, 20, 14, 2, 16, 10};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.out.println("The Third Largest Number is: " + a[a.length-3]);  
		System.out.println("The Third Largest Number is: " + b[b.length-3]);
	}
}