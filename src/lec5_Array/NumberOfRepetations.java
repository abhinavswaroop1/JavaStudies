package lec5_Array;

/*Find the number of Repetations */

public class NumberOfRepetations {

	public static void main(String[] args) {
		
		int a[]= {100,200,300,200,200,400};
		
		int value = 200;
		int count = 0;
		
		for(int i = 0 ; i<=a.length-1;i++) {
			if(value == a[i]) {
				count++;				
			}
		}
		System.out.println("The Repetation count of the value " + value + " is: " + count );
	}
}