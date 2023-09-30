package Collections;

import java.util.ArrayList;

public class EvenArraylist {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		for(Integer i:al) {
			if(i%2==0) {
				System.out.print(i);
			}
		}
		
	}

}
