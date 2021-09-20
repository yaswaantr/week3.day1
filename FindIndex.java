package week3.day1.assignment;

public class FindIndex {

	public static void main(String[] args) {

		String str = "Java Exercise";

		// Using indexOf Method
		System.out.println("Using indexOf Method");

		System.out.println("Index of E is: " + str.indexOf('E'));

		System.out.println("Index of s is: " + str.indexOf('s'));

		// Using Traditional Method
		
		System.out.println('\n' + "Using Traditional Method: toCharArray & For & IF Loops");

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			char charAt = str.charAt(i);

			if (charAt == 'E') {
				System.out.println("Index of " + charAt + " is: " + i);
				continue;
			}

			if (charAt == 's') {
				System.out.println("Index of " + charAt + " is: " + i);
				return;
			}

		}

	}

}