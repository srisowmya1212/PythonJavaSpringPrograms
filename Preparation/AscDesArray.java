package sri;

import java.util.Scanner;

public class AscDesArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array:  ");
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
		int temp=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(obj[i]>obj[j]) {
					temp=obj[i];
					obj[i]=obj[j];
					obj[j]=temp;
				}
			}
		}
		System.out.println("elements of an array in ascending order is:");
		System.out.print("[");
		for(int i=0;i<size;i++) {
			System.out.print(obj[i]+" ");
		}
		System.out.println("]");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(obj[i]<obj[j]) {
					temp=obj[i];
					obj[i]=obj[j];
					obj[j]=temp;
				}
			}
		}
		System.out.println("the elements of an array in descending order is: ");
		System.out.print("[");
		for(int i=0;i<size;i++) {
			System.out.print(obj[i]+" ");
			
		}
		System.out.println("]");
		
		
	}

}
