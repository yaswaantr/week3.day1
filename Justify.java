package week3.day1.assignment;

public class Justify {

	public static void main(String[] args) {
		int str3 = 111;
		int str4 = 111;

		// String str3 = new String("Kutty");
		// String str4 = new String("Kutty");

		if (str3 == str4) {
			System.out.println("Same Text");
		} else {
			System.out.println("Diff Text");
		}

		System.out.println('\n' + "Justification is :" + '\n'
				+ "1. == operator is used to perform a referential equality comparison." + '\n'
				+ "2. If statement will not be executed as the strings are compared using the == operator. " + '\n'
				+ "3. Java objects such as String objects, the == operator compares object references, not object values. "
				+ '\n'
				+ "4. While the two String objects above contain the same string values, they refer to different object references, so the System.out.println statement will not be executed.");

	}
}
