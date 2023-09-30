package programmingclass;

import java.util.Scanner;

public class Array_operation_testmethod {

	public static void main(String[] args) {
		Array_operationsnonstatic a1=new Array_operationsnonstatic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element"+(i+1));
			array[i] = sc.nextInt();
		}
		a1.display(array);
		while (true) {

			System.out.println(
					"1.Display\n2.Insertion\n3.Deletion\n4.Updation\n5.Sorting\n6.Searching\n7.Maximum element\n8.Minimum element\n9.Reverse\n10.IsEmpty\n11.Exit");

			System.out.println("Enter the choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				a1.display(array);
				break;

			}
			case 2: {
				System.out.println("Enter the element for insertion:");
				int element = sc.nextInt();
				System.out.println("Enter the position for insertion: ");
				int position = sc.nextInt();
                array = a1.insertion(array, size, element, position);
				System.out.println("The array elements after insertion: ");
				a1.display(array);
				break;

			}
			case 3:
				System.out.println("Enter the element for  deletion:");
				int delele = sc.nextInt();
				array = a1.deletion(array, size, delele);
				System.out.println("The array elements after deletion: ");
				a1.display(array);
				break;
			case 4:
				System.out.println("Enter the element for  replacing element:");
				int relele = sc.nextInt();
				System.out.println("Enter the element for new element:");
				int newele = sc.nextInt();
				a1.updation(array, size, relele, newele);
				break;

			case 5:
				array =a1.sorting(array);
				System.out.println("The elements after sorting:");
				a1.display(array);
				break;
			case 6:
				System.out.println("Enter the element to search:");
				int element = sc.nextInt();
				int index = a1.search(array, element);
				System.out.println("Element found at position: " + (index+1));
				break;
			case 7:

				int max = a1.maximum(array, size);
				System.out.println("The maximum element in array list is: " + max);
				break;
			case 8:
				int min = a1.minimum(array, size);
				System.out.println("The minimum element in the array list is: " + min);
				break;
			case 9:
				int[] rev=a1.reverse(array);
				a1.display(rev);
				break;
			case 10:
				if(a1.isEmpty(array)) {
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

}
