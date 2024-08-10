refer this program gcd in LCM.java class 


package sri;

import java.util.Scanner;

public class GCD {
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
		int gcd=gcd(obj);
		System.out.println(gcd);
		
		
	}
	public static int gcd(int[] obj) {
		int gcd=obj[0];
		for(int i=1;i<obj.length;i++) {
			gcd=gcd1(gcd,obj[i]);
		}
		return gcd;
	}
	public static int gcd1(int a,int b) {
		int min=(a>b)?b:a;//without this we cant get gcd
		for(int i=min;i>=1;i--) {//for gcd it is min and for lcm it is max
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return 1;
	}

}
