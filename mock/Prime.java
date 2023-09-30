package mock;

import java.util.Scanner;

public class Prime {
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
			int[] occ=new int[size];
			int count=0;
			for(int i=0;i<size;i++) {
				if(checkDuplicate(obj,occ,i)) {
					count++;
				}           
			}
			int[] res=new int[count];
			for(int i=0,j=0;i<size;i++) {
				if(checkDuplicate(obj, occ, i)) {
					res[j]=obj[i];
					j++;
				}
			}
			System.out.println("the elements after removing duplicates and primes : ");
			System.out.print("[");
			for(int a:res) {
				System.out.print(a+" ");
			}
			System.out.println("]");
			
		}
		public static boolean checkDuplicate(int obj[],int occ[],int i) {
			int count=1;
			for(int j=i+1;j<obj.length;j++) {
				if(obj[i]==obj[j]) {
					count++;
					occ[j]=1;
				}
				
			}
			if(count>=1&& occ[i]!=1&&prime(obj[i])) {
				return true;
			}
			
			return false;
		}
		public static boolean prime(int n) {
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			return count==2;
			
		}

	}