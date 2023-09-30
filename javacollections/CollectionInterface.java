package javacollections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {

	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<>();
		collection.add("apple");
		collection.add("mango");
		collection.add("sapota");
		//add api is used to add the elements
		System.out.println(collection);
		collection.remove("mango");
		System.out.println(collection);
		System.out.println(collection.contains("mango"));
		collection.forEach((sri)->
		{
			System.out.println(sri);
		});
		
	}

}
