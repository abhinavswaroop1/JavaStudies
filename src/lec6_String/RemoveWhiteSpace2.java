package lec6_String;

public class RemoveWhiteSpace2 {

	public static void main(String[] args) {
		String s = "Abhi\tSwaroop QA\nEngineer";
		
		String o = s.replace("\t", "");
		o = o.replace(" ", "");
		o = o.replace("\n", "");
		System.out.println(o);
	}
}