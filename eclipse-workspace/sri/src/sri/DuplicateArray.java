package sri;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray {

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
		Arrays.sort(obj);
		//System.out.println("after sorting:");
		//System.out.println(obj);//we get obj address
		size = remove(obj, size);
		System.out.println("after removing the duplicate elements, the size is: ");
		System.out.println(size);
		System.out.println("after removing duplicate:");
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			System.out.print(obj[i] + " ");
		}
		System.out.println("]");

	}

	public static int remove(int[] obj, int size) {
		if (size == 0 || size == 1) {
			return size;
		}
		int[] temp = new int[size];// creating another array only for storing the unique elements
		int j = 0;// for next element
		for (int i = 0; i < size - 1; i++) {
			if (obj[i] != obj[i + 1]) {
				temp[j++] = obj[i];
			}
		}
		//below condition is for for example there are size of 4 so index position if (obj[i] != obj[i + 1]) check o and 1 and then not equal it will update 0 index number and then check 1 and 2 same no update and check 2 and 3 not same it will update 2 and last is noyt updating so will update using temp[j++]=obj[size-1] i.e; last element totemp variable and it will update . here we are doing j++ so it will update index how many we inseert  we are not giving directly size.before doing better so sort
		temp[j++] = obj[size - 1];//if we remove this line the duplicate is removed permentaley in the array
		// changing the original array
		for (int i = 0; i < j; i++) {
			obj[i] = temp[i];
		}
		return j;
	}

}
