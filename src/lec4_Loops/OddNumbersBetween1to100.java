package lec4_Loops;

/*8. Write a program to print all odd number between 1 to 100*/

public class OddNumbersBetween1to100 {

	public static void main(String[] args) {
		for(int i=100;i>=1;i--) {
			if(i%2!=0) {
				System.out.println(i);				
			}
		}

	}

}
