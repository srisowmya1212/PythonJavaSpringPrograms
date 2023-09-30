package sri;

import java.util.Scanner;

public class ReverseWordSen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence to reverse: ");
		String sen = sc.nextLine();
		String[] word = sen.split(" ");
		String revsen = " ";
		

		for (int i = 0; i < word.length; i++) {
			String splitword = word[i];
			String revword = " ";
			for (int j = splitword.length() - 1; j >= 0; j--) {
				revword = revword + splitword.charAt(j);
			}
			revsen = revsen + revword + " ";
		}
		System.out.println("the reverse words in a string is:  " + revsen);

	}

}
