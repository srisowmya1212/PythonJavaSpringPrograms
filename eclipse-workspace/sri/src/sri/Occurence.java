package sri;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array:  ");
		int size = sc.nextInt();
		int[] obj = new int[size];
		int[] freq = new int[size];
		int visited = -1;
		for (int i = 0; i < size; i++) {
			obj[i] = sc.nextInt();
		}
		System.out.println("the elements of an array is: ");
		System.out.print("[");
		for (int a : obj) {
			System.out.print(a + " ");

		}
		System.out.println("]");

		
		for (int i = 0; i < size; i++) {
			int count=1;
			for (int j = i + 1; j < size ; j++) {
				if (obj[i] == obj[j]) {
					count++;
					// to avoid counting same element again
					freq[j] = visited;

				}
			}
			if (freq[i] != visited) {
				freq[i] = count;
			}
		}

		System.out.println("the occurence of element  ");
		for (int i = 0; i < freq.length; i++) {//take freq.length bcoz t know the frequency length of each element
			if (freq[i] != visited) //if we take size the element gets again counted which gives wrong countingz

				System.out.println("the occcurence of element " + obj[i] + "  is " + freq[i]);
			
		}

	}

}
