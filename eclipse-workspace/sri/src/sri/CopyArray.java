package sri;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array:  ");
		int size=sc.nextInt();
		int[] obj=new int[size];
		
		for(int i=0;i<size;i++) {
			obj[i]=sc.nextInt();
			
		}
		System.out.println("the elements of array is: ");
		System.out.print("[");
		for(int a:obj) {
			
			System.out.print(a+" ");
			
		}
		System.out.println("]");
		int[] obj1=new int[size];
		for(int i=0;i<size;i++) {
			obj1[i]=obj[i];
		}
		System.out.println("the elements of new array is: ");
		System.out.print("[");
		for(int b:obj1) {
		   System.out.print(b+" ");
		}
		System.out.println("]");
	}
	 
	 

}
