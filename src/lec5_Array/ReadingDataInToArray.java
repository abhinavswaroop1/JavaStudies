package lec5_Array;

import java.util.Arrays;

public class ReadingDataInToArray {

	public static void main(String[] args) {
		
		String name [] = {"Abhinav", "Abhishek", "Abhiram" ,"Adidas", "Abibas", "Ram" , "Raj"};
		
		System.out.println("Here is the non-sorted names in Array: " + Arrays.toString(name)); 
		
		Arrays.sort(name);
		
		System.out.println("Here is the sorted names in Array: " + Arrays.toString(name)); 
	}
}