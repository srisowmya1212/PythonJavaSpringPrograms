package sri;

import java.util.Scanner;

public class EvenArray {

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
		System.out.println("the elements of an evenposition array elements:  ");
		System.out.print("[");
		for(int i=1;i<size;i=i+2) {//dont consider index value take first position as 1,2-- not as 0,1,2
			System.out.print(obj[i]+" ");//thats why consider from 1
		}
		System.out.println("]");
		System.out.println("the elements of an oddposition array elements: ");
		System.out.print("[");
		for(int i=0;i<size;i=i+2) {
			System.out.print(obj[i]+" ");
		}
		System.out.println("]");
		
	}

}
