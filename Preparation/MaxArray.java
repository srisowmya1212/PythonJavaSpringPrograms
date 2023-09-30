package sri;

import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int size=sc.nextInt();
		int[] obj=new int[size];
		for(int i=0;i<size;i++) {
			obj[i]=sc.nextInt();
		}
		System.out.println("the elements of an array is: ");
		System.out.print("[");
		for(int a:obj) {
			System.out.print(a+" ");
		}
		System.out.println("]");
		int max=obj[0];
		for(int i=0;i<size;i++) {
			if(obj[i]>max) {
				max=obj[i];
			}
			
			
		}
		System.out.println("the maximum number in the array is :"+ max);
		int min=obj[0];
		for(int i=0;i<size;i++) {
			if(obj[i]<min) {
				min=obj[i];
			}
		}
		System.out.println("the minimum number in the array is :"+ min);
		
	}

}
