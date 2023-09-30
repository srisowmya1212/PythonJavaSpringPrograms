package programmingclass;

import java.util.Scanner;

public class Array_Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element"+(i+1));
			array[i] = sc.nextInt();
		}
		display(array);
		while (true) {

			System.out.println(
					"1.Display\n2.Insertion\n3.Deletion\n4.Updation\n5.Sorting\n6.Searching\n7.Maximum element\n8.Minimum element\n9.Reverse\n10.IsEmpty\n11.Exit");

			System.out.println("Enter the choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				display(array);
				break;

			}
			case 2: {
				System.out.println("Enter the element for insertion:");
				int element = sc.nextInt();
				System.out.println("Enter the position for insertion: ");
				int position = sc.nextInt();
                array = insertion(array, size, element, position);
				System.out.println("The array elements after insertion: ");
				display(array);
				break;

			}
			case 3:
				System.out.println("Enter the element for  deletion:");
				int delele = sc.nextInt();
				array = deletion(array, size, delele);
				System.out.println("The array elements after deletion: ");
				display(array);
				break;
			case 4:
				System.out.println("Enter the element for  replacing element:");
				int relele = sc.nextInt();
				System.out.println("Enter the element for new element:");
				int newele = sc.nextInt();
				updation(array, size, relele, newele);
				break;

			case 5:
				array = sorting(array);
				System.out.println("The elements after sorting:");
				display(array);
				break;
			case 6:
				System.out.println("Enter the element to search:");
				int element = sc.nextInt();
				int index = search(array, element);
				System.out.println("Element found at position: " + (index+1));
				break;
			case 7:

				int max = maximum(array, size);
				System.out.println("The maximum element in array list is: " + max);
				break;
			case 8:
				int min = minimum(array, size);
				System.out.println("The minimum element in the array list is: " + min);
				break;
			case 9:
				int[] rev=reverse(array);
				display(rev);
				break;
			case 10:
				if(isEmpty(array)) {
					System.out.println("Array is empty");
				}else {
					System.out.println("Array is not empty");
				}
				break;
			case 11:
				System.out.println("Program terminated\n Thank u have a nice day");
				System.exit(0);

			default:
				System.out.println("Enter the correct choice");
				break;

			}
		}
	}

	public static void display(int array[]) {

		System.out.println("The elements of an array is:");
		System.out.print("[");
		for (int b : array) {
			System.out.print(b + " ");
		}
		System.out.println("]");

	}



	public static int[] insertion(int[] array, int size, int element, int position) {
		int result[] = new int[size + 1];
		if (position > size + 1 || position <= 0) {
			System.out.println("Insertion is not possible");
		} else {

			for (int i = 0, j = 0; i < result.length; i++) {
				if (i == (position - 1)) {
					result[i] = element;
				} else {
					result[i] = array[j++];
				}
			}

		}
		return result;
	}

	public static int[] deletion(int[] array, int size, int delele) {
		int result[] = new int[size - 1];
		int index = search(array, delele);
		if (index == -1) {
			System.out.println("Deletion not possible");
		} else {

			for (int i = 0, j = 0; i < size; i++) {
				if (index != i) {
					result[j++] = array[i];

				}
			}
		}
		return result;
	}

	public static int search(int[] array, int delele) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == delele) {
				return i;
			}
		}
		return -1;
	}

	public static void updation(int[] array, int size, int relele, int newele) {

		if (search(array, relele) == -1) {
			System.out.println("Updation not possible");
		} else {
			for (int i = 0; i < size; i++) {
				if (array[i] == relele) {
					array[i] = newele;
					break;
				}

			}
			System.out.println("The array elements after updation:");
			display(array);
		}
	}

		public static int[] sorting(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static int maximum(int[] array, int size) {
		int max = array[0];
		for (int i = 0; i < size; i++) {

			if (array[i] > max) {
				max = array[i];

			}

		}
		return max;

	}

	public static int minimum(int[] array, int size) {
		int min = array[0];
		for (int i = 0; i < size; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;

	} 
	public static int[] reverse(int[] array) {
		int[] rev=new int[array.length];
		for(int i=0,j=array.length-1; i<array.length;i++,j--) {
			rev[i]=array[j];
		}
		return rev;
	}
	public static boolean isEmpty(int[] array) {
		return array.length==0;
	}

}
