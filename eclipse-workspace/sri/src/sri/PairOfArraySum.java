package sri;

import java.util.Scanner;

public class PairOfArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();
		System.out.println("Enter the elements of an array:");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("The elements of an array is: ");
		System.out.print("[");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println("]");
		System.out.println("Enter the sum:");
		int sum = sc.nextInt();
		
		int count=toFindPair(array, size, sum);
		System.out.println("No of pairs formed is: "+count);
		

	}

	public static int toFindPair(int[] array, int size, int sum) {
		int count=0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
			

					if (array[i] + array[j] == sum) {//if u want to check for three elements then take for(int k=j+1;k<size;k++) and add array[k
						System.out.println("(" + array[i] + "," + array[j] + ")");//at sum
						
						count++;
					}
					
				
			}
		}
		return count;

	}

}
