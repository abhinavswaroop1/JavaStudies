package lec6_String;

import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {
        
        //Approach to Store a Single word String in Reversed format.
        System.out.println("Enter the Single word String you want to Reverse: ");
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  //.next() = only reads one word and stops reading after space.
        
        //Took rev variable so that the reversed string storing a word in it.
        String rev = "";
        
        //Applying for loop using length() & charAt()
        for(int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);            
        }
        
        // VERY IMPORTANT: clear the leftover newline after next()
        sc.nextLine();
        
        //Approach to Store a Line with Spaces String in Reversed format. 
        System.out.println("Enter the Line String you want to Reverse: ");
        String st = sc.nextLine(); //.nextLine() = reads the whole line including spaces.
        
        //Took rever variable so that the reversed string storing a Line including spaces in it.
        String rever = "";
        
        for(int j = st.length() - 1; j >= 0; j--) {
            rever = rever + st.charAt(j);
        }
        
        System.out.println("One Word Reversed String is: " + rev);
        System.out.println("Whole Line including Spaces are reversed as: " + rever);
        
        sc.close();
    }   
}