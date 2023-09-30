package Array;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String sen = sc.nextLine();
		String revStr = " ";
		String res="";
		String[] splitted = sen.split(" ");
		for (int i = 0; i < splitted.length; i++) {
			String words = splitted[i];
			String revword = " ";
			for (int j = words.length() - 1; j >= 0; j--) {
				revword = revword + words.charAt(j);
			}
			revStr = revStr + revword + " ";
		}
		System.out.println("the reversed string is: "+revStr);
		

	}

}
