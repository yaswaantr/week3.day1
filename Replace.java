package week3.day1.assignment;

public class Replace {

	public static void main(String[] args) {

		String sentence = "I am working with Java 8";
		
		//Replace 8 to 11
		String sen = sentence.replaceAll("8", "11");
		
		System.out.println("Replacing 8 with 11 the sentence changes to : " + sen );
		
		//Add # to given string
		String updated = sen + '#';
		System.out.println("Updated String is : " + updated );
		
		
		//Print from index 5 to 14
		String index = sen.substring(5, 15);
		
		System.out.println("Printing from Index 5 : " + index);
		
	}

}