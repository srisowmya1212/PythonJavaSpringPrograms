package Array;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int sum=0;
		while(num > 0) {
			
			int rem = num % 10;
			
			if(rem % 2 == 0) {
				// sum=(int) (sum+Math.sqrt(rem));
			   
				 sum = sum + rem * rem;
				
			}
			
			num=num/10;
		}
		
		System.out.println(" the sum is:" + sum);
		

	}

}
