package mock;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int space = 3;
		int star = 0;

		for (int i = 1; i <= 5; i++) {
			if (i >= 4) {
				star--;
				space++;
			} else {
				star++;
				space--;
			}

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				
					System.out.print("*");
				

			}
			for(int j=0;j<=6;j++) {
				if(i==2 &&j>=3) {
					System.out.print("a");
				}
				if(i==3 &&j>=3) {
					System.out.print("b");
				}
				if(i==4 &&j>=3) {
					System.out.print("c");
				}
			}
			System.out.println();
		}

	}

}
