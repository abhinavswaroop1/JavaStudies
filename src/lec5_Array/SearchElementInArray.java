package lec5_Array;

import java.util.Arrays;

/* Search Element in Array*/

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int a[] = {100,200,300,400,500};
		int search_Element = 300;
		boolean status = false;
		
		System.out.println("Below are the elements present in an Array: " +  Arrays.toString(a));
		
		for(int i=0; i<=a.length-1;i++) {
			if(a[i]==search_Element) {
			System.out.println("Element Found which is: " + a[i]);
			status=true;
			break;
			}
		}
		if(status==false) {
			System.out.println("Element not Found.");
		}
		}
}