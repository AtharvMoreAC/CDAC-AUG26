
public class StringAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1. Write a Java program to get the character at the given index within the String.
// Sample Output:
// Original String = Java Exercises!
// The character at position 0 is J
// The character at position 10 is i
		
		String Original_String = "Java Exercises!";
		
		char zerothposition = Original_String.charAt(0);
		char tenthposition = Original_String.charAt(10);
		
		System.out.println("Original String = " + Original_String);
		System.out.println("The character at position 0 is " + zerothposition);
		System.out.println("The character at position 10 is " + tenthposition);
		
// 2. Write a Java program to compare two strings lexicographically.
// Two strings are lexicographically equal if they are the same length
// and contain the same number of characters in the same positions.
// Sample Output:
// String 1: This is Exercise 1
// String 2: This is Exercise 2
// "This is Exercise 1" is less than "This is Exercise 2"
		
		String s1 = "This is Exercise 1";
		String s2 = "This is Exercise 2";
		
		int ans = s1.compareTo(s2);
		
		System.out.println("String 1: " + s1);
		System.out.println("String 2: " + s2);
		
		if (ans < 0) {
			System.out.println("\""+ s1 + "\" is less than \"" + s2 + "\"");
		}
		else if (ans > 0) {
			System.out.println("\"" + s2 + "\" is less than \"" + s1 + "\"");
		}
		else {
			System.out.println("Both are equal");
		}
		
// 3. Write a Java program to check whether a given string ends with
// the contents of another string.
// Sample Output:
// "Python Exercises" ends with "se"? false
// "Python Exercise" ends with "se"? true

		String s3 = "Python Exercises";
		String s4 = "Python Exercise";

		boolean ss = s3.endsWith("se");
		boolean sss = s4.endsWith("se");

		System.out.println("\"" + s3 + "\" ends with \"se\"? " + ss);
		System.out.println("\"" + s4 + "\" ends with \"se\"? " + sss);

		
// 4. Write a Java program to get the index of all the characters of the alphabet.
// Sample string of all alphabet:
// "The quick brown fox jumps over the lazy dog."

		String alpha = "The quick brown fox jumps over the lazy dog.";

		for (char c = 'a'; c <= 'z'; c++) {

		System.out.print(alpha.toLowerCase().indexOf(c) + " ");
	}

		System.out.println();


// 5. Write a Java program to replace each substring of a given string
// that matches the given regular expression with the given replacement.
// In the above string replace all the fox with cat.
// Sample Output:
// Original string: The quick brown fox jumps over the lazy dog.
// New String: The quick brown cat jumps over the lazy dog.

		String sample = "The quick brown fox jumps over the lazy dog.";

		String newString = sample.replaceAll("fox", "cat");

		System.out.println("Original string: " + sample);
		System.out.println("New String: " + newString);


// 6. Write a Java program to convert all the characters in a string to uppercase.
// Sample Output:
// Original String: The Quick BroWn FoX!
// String in uppercase: THE QUICK BROWN FOX!

		String original = "The Quick BroWn FoX!";

		System.out.println("Original String: " + original);
		System.out.println("String in uppercase: " + original.toUpperCase());


// 7. Write a Java program to reverse a string.
// Sample Output:
// The given string is: The quick brown fox jumps
// The string in reverse order is:
// spmuj xof nworb kciuq ehT

		String o = "The quick brown fox jumps";
		String n = " ";

		for (int i = o.length() - 1; i >= 0; i--) {

			n = n + o.charAt(i);
		}

		System.out.println("The given string is: " + o);
		System.out.println("The string in reverse order is:");
		System.out.println(n);
		
		
		

	}

}
