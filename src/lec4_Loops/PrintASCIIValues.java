package lec4_Loops;

public class PrintASCIIValues {

	public static void main(String[] args) {
		
		System.out.println("Enter the charcter for which you need ASCII Value: ");
		
		for( char ch= 'A' ;  ch<='z'; ch++) {
			System.out.println((int)ch);
		}
	}
}