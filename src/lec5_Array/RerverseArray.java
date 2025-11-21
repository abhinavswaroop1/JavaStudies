package lec5_Array;


/*
 Input: arr[] = [1, 4, 3, 2, 6, 5]  
Output:  [5, 6, 2, 3, 4, 1]


Input: arr[] = [4, 5, 1, 2]
Output: [2, 1, 5, 4]

 */

import java.util.Arrays;

public class RerverseArray {

    public static void main(String[] args) {
        
        int a[] = {1, 4, 3, 2, 6, 5}; 
        int b[] = {4, 5, 1, 2};
        
        // Reverse array a
        int revA[] = new int[a.length];
        int indexA = 0;
        
        int revB[] = new int[b.length];
        int indexB = 0;
       
        for(int i = a.length-1; i>=0;i--) {
        	revA [indexA] = a[i];
        	indexA++;
        }
        
        for(int j = b.length-1;j>=0;j--) {
        	revB[indexB] = b[j];
        	indexB++;
        }
        
        System.out.println("Reverse Array 1: " + Arrays.toString(revA));
        System.out.println("Reverse Array 2: " + Arrays.toString(revB));
    }
}