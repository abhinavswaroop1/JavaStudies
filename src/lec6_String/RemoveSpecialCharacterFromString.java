package lec6_String;

/* Input → "Hello@ Abhi# QA!"
 * Output → "Hello Abhi QA" 
 */

public class RemoveSpecialCharacterFromString {

	public static void main(String[] args) {
		String s = "Hello@ Abhi# QA!";
		
		//Remove all the alphabets, Characters, Numbers & Spaces.
		String output = s.replaceAll("[^a-zA-Z0-9 ]", "");
		
		System.out.println(output);
	}
}