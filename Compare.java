package week3.day1.assignment;

public class Compare {

	public static void main(String[] args) {

		String string1 = "I am Learning Java";
		String string2 = "I am learning java";

		if (string1 == string2) {
			System.out.println("Both Strings are same- compared using == operator");
		} 

		if (string1.equals(string2)) {
			System.out.println("Both Strings are same -  compared using equals");
		} 
		if (string1.equalsIgnoreCase(string2)) {
			System.out.println("Both Strings are same - compared using equalsIgnoreCase");
		} 

	}

}

//explore with ==
//equals
//equalsignorecase