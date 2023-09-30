package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListExample {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(8);
		list.add(10);
		list.add(68);
		list.add(1);
		list.add(36);
		list.add(6);
		//collections util class provides sort api to sort the elements.Collections is a class
		Collections.sort(list);//By default sort in ascending order
		System.out.println(list);
		Collections.reverse(list);//to print the elements in descending order
		System.out.println(list);
		
	}

}
