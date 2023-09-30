package com.sri.oops;

public class LogicalBitwise {
	volatile static int d=20;
	
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=20;
		
		System.out.println(d);
		System.out.println(a<b && a++<c);//logical it checks second condition when the first is true
		System.out.println(a);
		System.out.println(a<b & a++<c);//bitwise it checks both conditions
		System.out.println(a);
		System.out.println(a>b || a++<c);//logical it checks second condition only when first is false
		System.out.println(a);
		System.out.println(a>b | a++<c);//bitwise
		System.out.println(a);
		
	}

}
