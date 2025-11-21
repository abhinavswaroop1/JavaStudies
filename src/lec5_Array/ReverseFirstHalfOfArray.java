package lec5_Array;

import java.util.Arrays;

/*Reverse only the first half of the array

Input:
[1, 2, 3, 4, 5, 6]
Output:
[3, 2, 1, 4, 5, 6]
*/

public class ReverseFirstHalfOfArray {

	public static void main(String[] args) {
		
		
		  int a [] = {1, 2, 3, 4, 5, 6};
        
        int n = a.length;
        int mid = n / 2;  // midpoint of the array
        
        // reverse the first half
        for (int i = 0; i < mid / 2; i++) {

//I took the temp variable here to reverse the array elements this is the logic of reversing any array

            int temp = a[i];   //temp = 1,2
            a[i] = a[mid - 1 - i]; //a[0]= (a[2]=3), a[1] = (a[1]=2) , 
            a[mid - 1 - i] = temp; //3,2
        }
        
        System.out.println("After reversing first half: " + Arrays.toString(a)); 		
		 
		
		/*
		int a[] = {1, 2, 3, 4, 5, 6};
		
		int mid = a.length/2;
		int rev [] = new int[a.length-3];
	    int index = 0;
	    
	    for(int i =a.length-4 ; i>=0;i--) {
	    	rev[index]= a[i];
	    	index++;
	    }
	    */
	  //  System.out.println("first half of the array reversed is: " + Arrays.toString(rev));
	}
}