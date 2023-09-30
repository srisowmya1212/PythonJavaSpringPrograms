package programmingclass;

public class Array_operationsnonstatic {
	public  void display(int array[]) {

		System.out.println("The elements of an array is:");
		System.out.print("[");
		for (int b : array) {
			System.out.print(b + " ");
		}
		System.out.println("]");

	}



	public int[] insertion(int[] array, int size, int element, int position) {
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

	public  int[] deletion(int[] array, int size, int delele) {
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

	public  int search(int[] array, int delele) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == delele) {
				return i;
			}
		}
		return -1;
	}

	public  void updation(int[] array, int size, int relele, int newele) {

		if (searchup(array, relele) == -1) {
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

	public  int searchup(int[] array, int relele) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == relele) {
				return i;
			}
		}
		return -1;
	}

	public  int[] sorting(int[] array) {
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

	public  int maximum(int[] array, int size) {
		int max = array[0];
		for (int i = 0; i < size; i++) {

			if (array[i] > max) {
				max = array[i];

			}

		}
		return max;

	}

	public  int minimum(int[] array, int size) {
		int min = array[0];
		for (int i = 0; i < size; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;

	} 
	public  int[] reverse(int[] array) {
		int[] rev=new int[array.length];
		for(int i=0,j=array.length-1; i<array.length;i++,j--) {
			rev[i]=array[j];
		}
		return rev;
	}
	public  boolean isEmpty(int[] array) {
		return array.length==0;
	}


}
