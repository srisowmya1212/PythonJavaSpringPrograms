int[] a=new int[]{1,2,3};
int[] b =new int[]{4,5,6};

//To remove duplicates


import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] obj = new int[size];
        for (int i = 0; i < size; i++) {
            obj[i] = sc.nextInt();
        }

        // Use a set to track seen numbers
        Set<Integer> seen = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (!seen.contains(obj[i])) {
                seen.add(obj[i]);
                res.add(obj[i]);
            }
        }

        // Print the result
        for (int num : res) {
            System.out.println(num);
        }
    }
}
















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




// to remove duplicates 
package com.sri.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the array of elements");
		int[] obj=new int[size];
		for(int i=0;i<size;i++) {
			obj[i]=sc.nextInt();
		}
		for(int a:obj) {
			System.out.print(a+" ");
		}
		int[] occ=new int[size];
		int resArraysize=0;
		for(int i=0;i<size;i++) {
			if(checkDuplicateArray(obj,occ,i)) {
				resArraysize++;
			}
		}
		int res[]=new int[resArraysize];
		int j=0;
		for(int i=0;i<res.length;i++) {
			if(checkDuplicateArray(obj, occ, i)) {
				res[j]=obj[i];
				j++;
			}
		}
		System.out.println("resulting array");
		for(int b:res) {
			System.out.print(b+" ");
		}
		
	}
	
	public static boolean checkDuplicateArray(int[] obj,int occ[], int index) {
		int count=0;
		for(int j=index+1;j<obj.length;j++) {
			if(obj[index]==obj[j]) {
				count++;
				occ[j]=1;
			}
		}
		if(occ[index]!=1) {
			return true;
		}
		return false;
	}
}
//remove duplicates and print prime in array

package com.sri.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the array of elements");
		int[] obj=new int[size];
		for(int i=0;i<size;i++) {
			obj[i]=sc.nextInt();
		}
		for(int a:obj) {
			System.out.print(a+" ");
		}
		int[] occ=new int[size];
		int resArraysize=0;
		for(int i=0;i<size;i++) {
			if(checkDuplicateArray(obj,occ,i)) {
				resArraysize++;
			}
		}
		int res[]=new int[resArraysize];
		int j=0;
		for(int i=0;i<res.length;i++) {
			if(checkDuplicateArray(obj, occ, i)) {
				res[j]=obj[i];
				j++;
			}
		}
		System.out.println("resulting array");
		for(int b:res) {
			System.out.print(b+" ");
		}
		
	}
	
	public static boolean checkDuplicateArray(int[] obj,int occ[], int index) {
		int count=0;
		for(int j=index+1;j<obj.length;j++) {
			if(obj[index]==obj[j]) {
				count++;
				occ[j]=1;
			}
		}
		if(occ[index]!=1 && count>=1&& prime(obj[index]) ) {
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

