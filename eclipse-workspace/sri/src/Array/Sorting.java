package Array;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int size = sc.nextInt();
		int[] obj = new int[size];
		
		for (int i = 0; i < size; i++) {
			obj[i] = sc.nextInt();
		}
		System.out.println(" the elements of an array is: ");
		System.out.print("[");
		for (int a : obj) {
			System.out.print(a + " ");
		}
		System.out.println("]");
		for (int i = 0; i < obj.length; i++) {
			int min = i;
			for (int j = i + 1; j < obj.length; j++) {
				if (obj[j] <obj[ min]) {
					min = j;
				}
			}
			int temp=obj[i];
			obj[i]=obj[min];
			obj[min]=temp;
		}
	   for(int a:obj) {
		   System.out.println(a+" ");
	   }
	}

}
