package sri;

import java.util.Scanner;

public class LowerToUpperViceVErsa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to convert: ");
		String str = sc.nextLine();
		StringBuffer newstr = new StringBuffer(str);
		for (int i = 0; i < str.length(); i++) {
			//checks for lowercase
			if (Character.isLowerCase(str.charAt(i))) {
				//converts it into upper case
				newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));

			}
			else if(Character.isUpperCase(str.charAt(i))) {
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("string after conversion:"+newstr);

	}

}
