package com.sri.oops;

public class Exception {

	public static void main(String[] args)  {
		try {
			
		System.out.println("hi");

      	System.out.println(8/0);
		System.out.println("hello");
		}catch(ArithmeticException e) {
			System.out.println("handled");
		}
		finally {
			System.out.println("finally block");
		}
		
	}

}
