package lec6_String;

public class CountCharacterOfString {

	public static void main(String[] args) {
		String s = "Java Programming Java oops";
	    System.out.println("The Entered String is: " + s);
	    
	    int countBeforeRemovingA = s.length();
	    
	    int countAfterReremovingA = s.replace("a" , "").length();
	    
	    int count = countBeforeRemovingA - countAfterReremovingA;
	    
	    System.out.println("The Total count of char 'a' in the String is : " + count);  
	}
}		