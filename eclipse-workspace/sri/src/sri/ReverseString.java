package sri;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to reverse: ");
		String word=sc.nextLine();
		String revword=" ";
		for(int i=word.length()-1;i>=0;i--) {
			revword=revword+word.charAt(i);
		}
		System.out.println("the reversed word is: "+revword);
	}

}
