package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonArraylist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList al1=new ArrayList<>();
		System.out.println("enter the size of arraylist 1:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			al1.add(sc.nextInt());
			
		}
		System.out.println(al1);
		ArrayList al2=new ArrayList<>();
		System.out.println("enetr the size of arraylist2: ");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++) {
			al2.add(sc.nextInt());
			
		}
		System.out.println(al2);
		for(Object o:al1) {
			for(Object o1:al2) {
				if(o.equals(o1)) {//we may use o==o1,here autoboxing occurs,but it wont work in all scenarios as it is object
					
					System.out.print(o+" ");
				}
			}
		}
		
		
	}

}
