package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateInArraylist {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList al1=new ArrayList<>();
		System.out.println("enter the size of arraylist :");//al1.add(2); al1.add(3);al1.add(2);al1.add(1);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			al1.add(sc.nextInt());
			
		}
		System.out.println(al1);
		HashSet hs=new HashSet<>(al1);
		System.out.print(hs);
		
	}

}
