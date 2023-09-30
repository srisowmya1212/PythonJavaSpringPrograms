package sri;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array:  ");
		int size=sc.nextInt();
		int[] obj=new int[size];
		for(int i=0;i<size;i++) {
			obj[i]=sc.nextInt();
		}
		System.out.println("the elements of an array :");
		System.out.print("[");
		for(int a:obj) {
			System.out.print(a+" ");
		}
		System.out.println("]");
		System.out.println("the elements of array after reversing: ");
		System.out.print("[");
		for(int i=obj.length-1;i>=0;i--) {
			System.out.print(obj[i]+" ");
		}
		System.out.println("]");
				
	}

}
