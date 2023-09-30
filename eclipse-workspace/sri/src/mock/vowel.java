package mock;

import java.util.Arrays;
import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String s = sc.nextLine();
		//s=s.toLowerCase();

		String v = "aeiouAEIOU";
		String res = "";
		

		for (int i = 0; i < s.length(); i++) {
			if (v.indexOf(s.charAt(i)) != -1) {
				res = res + s.charAt(i);
			}
		}

		System.out.println(res);
		char[] charArray=res.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
	
		
		
		
		
		
	}


}
