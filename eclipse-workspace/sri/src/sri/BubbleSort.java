package sri;

import java.util.Scanner;

public class BubbleSort {
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
		int temp;
		for(int i=0;i<obj.length;i++) {
			for(int j=1;j<obj.length;j++) {
				if(obj[j-1]>obj[j]) {
					 temp=obj[j-1];
					 obj[j-1]=obj[j];
					 obj[j]=temp;
					
					
				}
			}
		}
		System.out.println("After bubble sort:");
		System.out.print("[");
		for(int a:obj) {
			System.out.print(a+" ");
		}
		System.out.println("]");
		
	}

}
