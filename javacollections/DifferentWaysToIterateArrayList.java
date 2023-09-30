package javacollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateArrayList {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("mango", "apple", "banana", "orange", "sapota");
		//before java8
		// basic for loop
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("-----------------------------------");
		// enchanced foreach loop
		for (String a : list1) {
			System.out.println(a);

		}
		System.out.println("--------------------------------------");
        // basic loop with iterator
		for (Iterator iterator = list1.iterator(); iterator.hasNext();) {
			String list2 = (String) iterator.next();
			System.out.println(list2);
			
		}
		System.out.println("---------------------------------------");
		//iterate with while
		Iterator<String> iterator=list1.iterator();
		while (iterator.hasNext()) {
		  String list3=(String)iterator.next();//String typecast is not mandatory
		  System.out.println(list3);
			
		}
		System.out.println("---------------------");
		//after java 8 features we use stream + lambda example
		//To iterate the list first we convert into stream and then we use lambda expression to iterate over the stream
		list1.stream().forEach(itr->System.out.println(itr+" with stream"));
		System.out.println("-----------------------");
		//java 8 with foreach+lambda instead of converting stream
		list1.forEach(itr1->System.out.println(itr1+" with foreach"));
	}

}
