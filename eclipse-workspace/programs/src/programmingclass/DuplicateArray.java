package programmingclass;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int size = sc.nextInt();
		int[] obj = new int[size];

		for (int i = 0; i < size; i++) {
			obj[i] = sc.nextInt();
		}
		System.out.println("the elements are:");
		System.out.print("[");
		for (int a : obj) {
			System.out.print(a + " ");
		}
		System.out.println("]");
		int[] occ = new int[size];
		// for calculating occurence of an element
		for (int i = 0; i < size; i++) {
			int count = 1;
			for (int j = i + 1; j < size; j++) {
				if (obj[i] == obj[j]) {
					count++;
					occ[j] = 1;
				}
			}
			if (count >=1 && occ[i] != 1) {
				System.out.println(obj[i] + "--->" + count);
				
			}
			
		}

	}
}
