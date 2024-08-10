package sri;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array:  ");
		int size = sc.nextInt();
		int[] obj = new int[size];
		for (int i = 0; i < size; i++) {
			obj[i] = sc.nextInt();
		}
		System.out.println("the elements of an array is: ");
		System.out.print("[");
		for (int a : obj) {
			System.out.print(a + " ");
		}
		System.out.println("]");
		int lcm = gcd(obj);
		System.out.println(lcm);

	}

	public static int gcd(int[] obj) {
		int gcd = obj[0];
		for (int i = 1; i < obj.length; i++) {
			gcd = lcmgcd(gcd, obj[i]);  // gcd = lcmgcd(obj[i],obj[i+1]);
		}
		return gcd;
	}

	public static int lcmgcd(int a, int b) {
		int gcd=1;
		int min = (a > b) ? b : a;// without this we cant get gcd
		for (int i = min; i >= 1; i--) {// for gcd it is min and for lcm it is max
			if (a % i == 0 && b % i == 0) {
				
				gcd=i;
				int lcm=(a*b)/gcd;
				return lcm;
			}
		}
		
		
		return 1;
	}

}

//refer fro calcualating gcd

package com.sri.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array:  ");
		int size = sc.nextInt();
		int[] obj = new int[size];
		for (int i = 0; i < size; i++) {
			obj[i] = sc.nextInt();
		}
		System.out.println("the elements of an array is: ");
		System.out.print("[");
		for (int a : obj) {
			System.out.print(a + " ");
		}
		System.out.println("]");
		int lcm = gcd(obj);
		System.out.println(lcm);

	}

	public static int gcd(int[] obj) {
		int gcd = obj[0];
		for (int i = 1; i < obj.length; i++) {
			gcd = lcmgcd(gcd, obj[i]);
		}
		return gcd;
	}

	public static int lcmgcd(int a, int b) {
		int gcd=1;
		int min = (a > b) ? b : a;// without this we cant get gcd
		for (int i = min; i >= 1; i--) {// for gcd it is min and for lcm it is max
			if (a % i == 0 && b % i == 0) {
				
				gcd=i;

				return gcd;
			}
		}
		
		
		return 1;
	}
}

