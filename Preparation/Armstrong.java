package sri;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :  ");
		int num=sc.nextInt();
		System.out.println(check(num));
	}
	public static String check(int num) {
		int sum=0,temp=num;
		while(num!=0) {
			int rem=num%10;
			sum=(int) (sum+Math.pow(rem, 3));
			num=num/10;
			
		}
		if(temp==sum) {
			return "given number is an armstrong number";
		}
		return "given number is not an armstrong number";
	}

}
