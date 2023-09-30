package javacollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		List<Integer> list2=new ArrayList<>(list1);//Arraylist constructor we are passing list1 elements into list2
		System.out.println(list2);
		List<Integer> list3=new ArrayList<>();
		list3.add(6);
		list3.add(7);
		list3.add(8);
		list3.add(9);
		list3.add(10);
		list2.addAll(list3);
		System.out.println(list2);
		//check if arraylist is empty or not
		List<String> list4=new ArrayList<>();
		System.out.println("checks whether arraylist is empty or not: "+list4.isEmpty());
		list4.add("java");
		list4.add("python");
		list4.add("c++");
		list4.add("c");
		list4.add("javascript");
		list4.add("sql");
		//find the size of arraylist
		System.out.println("the size of list is: "+list4.size());
		//how to retrieve element at the given index
		System.out.println("Langauage known : "+list4.get(0));
		//modify the element
		list4.set(2, "c#");
		System.out.println("modify c++ to c#: "+ list4);
		//remove( int index) and remove(Object o) the particular element
		list4.remove(3);
		System.out.println("after removing element at index 3: "+list4);
		list4.remove("sql");
		System.out.println("after removing sql element: "+list4);
		//removeall() is used to remove collections of elements.It accepts only Collection
		List<String> remove=new ArrayList<>();
		remove.add("python");
		remove.add("javascript");
		list4.removeAll(remove);
		System.out.println(list4);
		//to remove all the elements from the list we use clear()
		list4.clear();
		System.out.println(list4);
		
		
		
		
		
	}

}
