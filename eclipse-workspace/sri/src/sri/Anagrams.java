package sri;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String string1 = sc.next();
		System.out.println("Enter the Second String: ");
		String string2 = sc.next();
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();// to convert to lowercase
		if (string1.length() != string2.length()) {
			System.out.println("Both strings are not anagrams");

		} else {
			// for extracting all characters one by one and stored in an array
			char[] str1 = string1.toCharArray();
			char[] str2 = string2.toCharArray();
			Arrays.sort(str1);// for sorting in unordered way
			Arrays.sort(str2);
			if (Arrays.equals(str1, str2)) {
				System.out.println("Both strings are anagrams");
			}
			else {
				System.out.println("Both strings are not anagrams");
			}

		}

	}

}
