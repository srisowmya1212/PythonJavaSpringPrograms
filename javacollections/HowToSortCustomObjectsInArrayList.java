package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HowToSortCustomObjectsInArrayList {
  //sorting employee class based on salary
	 public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, 28, "arun", 8000));
		list.add(new Employee(1, 38, "sai", 4000));
		list.add(new Employee(1, 58, "bunny", 9000));
		list.add(new Employee(1, 30, "suresh", 2000));
		list.add(new Employee(1, 25, "ragu", 1000));
		Collections.sort(list, new MySort());
		System.out.println(list);
		//as we know that comparator interface is a functional interface we use lambda expressions.
		//anonymous implementation of functional interface
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getSalary()-o2.getSalary(); //ascending order
			}
		});;
		System.out.println(list);
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getName().compareTo(o2.getName());//sorting name in ascending order using comparator anonymous function
			}
		});
		System.out.println(list);
		Collections.sort(list, (o1,o2)->o2.getName().compareTo(o1.getName()));//sorting name using lambda expression
		System.out.println(list);
		Collections.sort(list, (o1,o2)->o2.getSalary()-o1.getSalary());//descending order
		System.out.println(list);
		
		
	
	}
}
class MySort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getSalary()-o2.getSalary(); //to sort in descending order
		
//		return (int) (o1.getSalary()-o2.getSalary());  //ascending order sorting based on salary typecast int is not mandatory
	}
	 
 }
