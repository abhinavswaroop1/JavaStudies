package lec4_Loops;

///*9. Write a program to find sum of all natural numbers between 1 to n*/
//
import java.util.Scanner;
public class SuOfAllNaturalNumbersFrom1toN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the last natural number (n): ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        // Loop from 1 to n and calculate sum
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The sum of all natural numbers from 1 to " + n + " is: " + sum);
        
        sc.close();
    }
}
