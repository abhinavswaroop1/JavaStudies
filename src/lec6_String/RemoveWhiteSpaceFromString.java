package lec6_String;

public class RemoveWhiteSpaceFromString {

    public static void main(String[] args) {
        String s = "Hello Abhi\tQA ";

        System.out.println("Before removing whitespace: " + s);

        String output = s.replace(" ", "");
        output = output.replace("\t", "");
        output = output.replace("\n", "");
        output = output.replace("\r", "");

        System.out.println("After removing whitespace: " + output);
    }
}