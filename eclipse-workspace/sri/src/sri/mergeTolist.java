import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   List<Integer> list1=new ArrayList<>();
	   list1.add(1);
	   list1.add(2);
	   
	   List<String> list2=new ArrayList<>();
	   list2.add("hello");
	   list2.add("world");
	   List<Object> list3=new ArrayList<>();
	   list3.addAll(list1);
	   list3.addAll(list2);
	   
	   System.out.println(list3);


	}
}
