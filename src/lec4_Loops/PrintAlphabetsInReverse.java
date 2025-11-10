package lec4_Loops;

/*6. Write a program to print reverse alphabets from Z to A*/

public class PrintAlphabetsInReverse {

	public static void main(String[] args) {
		for(char c = 'Z';c>='A';c--) {
			System.out.println(c);		
		}
	}
}