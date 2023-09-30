package sri;

import java.util.Scanner;

public class RevEachWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence: ");
		String sen=sc.nextLine();
		String[] word=sen.split(" ");
		String revsen=" ";
		for(int i=word.length-1;i>=0;i--) {
			revsen=revsen+word[i]+" ";
				
		}
		System.out.println("the reversing a string by each word by word is: "+revsen);
	}

}
