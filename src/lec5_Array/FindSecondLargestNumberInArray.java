package lec5_Array;

import java.util.Arrays;

public class FindSecondLargestNumberInArray {

    public static void main(String[] args) {

        int[] a = {-10, -2, 5, 20, 7, 10, 18};

        Arrays.sort(a);
        System.out.println("Sorted Array: " + Arrays.toString(a));

        int secondLargest = a[a.length - 2];
        System.out.println("Second Largest Number is: " + secondLargest);
    }
}
