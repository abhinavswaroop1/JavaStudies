package lec5_Array;

/* Find Missing Number In Array
 * a[] = {1,4,5,3};
 * 
 * logic to find missing number is .. 
 * 1. sum of the total number of elements present in Array using for loop and store in 1 variable.
 * 2. sum of the total Index of elements in Array (including missing element) using for loop and store in 2 variable.
 * 3. Substract 2 variable from 1 variable = Get Missing element. 
 */

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int a[] = {1,4,5,3};		
		
		
		//sum of the total number of elements present in Array using for loop and store in 1 variable.
		int sum = 0;
		for(int i=0;i<=a.length-1;i++) {
			sum= sum+a[i];
		}
		System.out.println(sum);
		
		//sum of the total Index of elements in Array (including missing element) using for loop and store in 2 variable.
		int sum1 = 0;
		for(int j=1;j<=5;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		
		//Substract 2 variable from 1 variable = Get Missing element. 
		System.out.println("The missing number is: " + (sum1-sum));
	}
}