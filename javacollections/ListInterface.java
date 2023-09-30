package javacollections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("ele1");
		list.add("ele1");
		list.add("ele2");
		list.add("ele3");
		System.out.println(list);//list allows duplicate values
		list.add(null);
		list.add(null);
		System.out.println(list);//list allows null values
		//list follows insertion order
		List<String> list1=new ArrayList<>();
		list1.add("mango");
		list1.add("apple");
		list1.add("orange");
		list1.add("sapota");
		System.out.println(list1);
		//accessing the elements from the list
		System.out.println(list1.get(0));
//		System.out.println(list1.get(4)); IndexOutOfBoundException
		System.out.println(list1.get(3));
		
		
	}

}
