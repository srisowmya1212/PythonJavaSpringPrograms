package sri;

import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] obj=new int[size];
		int[] res=new int[size];
		for(int i=0;i<size;i++) {
			obj[i]=sc.nextInt();
		}
		for(int a:obj) {
			System.out.print(a+" ");
		}
		for(int i=0,j=obj.length-1;i<obj.length;j--,i++) {
			res[i]=obj[j];
			
		}
		System.out.println("after reversing");
		for(int b:res) {
		System.out.print(b+" ");
		}
	}
	
}
