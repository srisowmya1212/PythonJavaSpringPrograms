package sri;

import java.util.Scanner;

public class SecondLargest {

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
		System.out.println("the second largest element in array is:"+ secondLarge(obj,size));
		System.out.println("the second smallest element in array is: "+secondSmall(obj,size));
		
	}
	public static int secondLarge(int[] obj,int size) {
		
		int temp=0;
		for(int i=0;i<size;i++) {
		
			for(int j=i+1;j<size;j++) {
				if(obj[i]>obj[j]) {//here the elements are sorted into ascending order and from the last second size we get largest
					temp=obj[i];
					obj[i]=obj[j];
					obj[j]=temp;
					
				}
			}
		}
		return obj[size-2];//second element bcoz if example size given 5 as index starts from 0,1,2,3,4 so to get position of 3 we should take size-2
	}
	public static int secondSmall(int[] obj,int size) {
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
		return obj[1];//second element bcoz index starts from 0
	}

}
