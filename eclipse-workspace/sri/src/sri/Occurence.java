//refere below progaran

package sri;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array:  ");
		int size = sc.nextInt();
		int[] obj = new int[size];
		int[] freq = new int[size];
		int visited = -1;
		for (int i = 0; i < size; i++) {
			obj[i] = sc.nextInt();
		}
		System.out.println("the elements of an array is: ");
		System.out.print("[");
		for (int a : obj) {
			System.out.print(a + " ");

		}
		System.out.println("]");

		
		for (int i = 0; i < size; i++) {
			int count=1;
			for (int j = i + 1; j < size ; j++) {
				if (obj[i] == obj[j]) {
					count++;
					// to avoid counting same element again
					freq[j] = visited;

				}
			}
			if (freq[i] != visited) {
				freq[i] = count;
			}
		}

		System.out.println("the occurence of element  ");
		for (int i = 0; i < freq.length; i++) {//take freq.length bcoz t know the frequency length of each element
			if (freq[i] != visited) //if we take size the element gets again counted which gives wrong countingz

				System.out.println("the occcurence of element " + obj[i] + "  is " + freq[i]);
			
		}

	}

}

///refer this


package com.sri.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the array of elements");
		int[] obj=new int[size];
		int[] occ=new int[size];
		for(int i=0;i<size;i++) {
			obj[i]=sc.nextInt();
		}
		for(int a:obj) {
			System.out.print(a+" ");
		}
		
		for(int i=0;i<obj.length;i++) {
			int cunt=1;
			for(int j=i+1;j<obj.length;j++) {
				if(obj[i]==obj[j]) {
					occ[j]=1;
					cunt++;
				}
			}
			if(occ[i]!=1) {
				occ[i]=cunt;
			}
		}
		System.out.println("The occcurence of elemenet");
		for(int i=0;i<occ.length;i++) {
			if(occ[i]!=1) {
				System.out.println("the occcurence of element " + obj[i] + "  is " + occ[i]);
			}
		}
		
	}
}
o/p:

5
Enter the array of elements
2
3
2
3
2
2 3 2 3 2 The occcurence of elemenet
the occcurence of element 2  is 3
the occcurence of element 3  is 2

	o/p2

Enter the size of array
5
Enter the array of elements
1
2
3
2
3
1 2 3 2 3 The occcurence of elemenet
the occcurence of element 2  is 2
the occcurence of element 3  is 2
