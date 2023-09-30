package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicate {
	public static void main(String[] args) {

		ArrayList al = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		HashSet hs = new HashSet<>(al);
		System.out.println(hs);
		//if u initialize count here it take as global variable and print all the values in hs objectso take it as local variable
		for (Object o : hs) {
			int count = 0;
			for (Object o1 : al) {
				if (o.equals(o1)) {
                     count++;
                     
				}
			}
			if(count>1) {
				System.out.println(o);
			}
		}
		

	}

}
