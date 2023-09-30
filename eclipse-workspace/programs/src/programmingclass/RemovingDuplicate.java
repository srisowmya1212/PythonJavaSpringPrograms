package programmingclass;

import java.util.Scanner;

public class RemovingDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int size=sc.nextInt();
		int[] obj=new int[size];
		for(int i=0;i<size;i++) {
			obj[i]=sc.nextInt();
		}
		System.out.println("the elements of an array is: ");
		System.out.print("[");
		for(int a:obj) {
			System.out.print(a+" ");
		}
		System.out.println("]");
		int[] occ=new int[size];
		int count=0;
		for(int i=0;i<size;i++) {
			if(checkDuplicate(obj,occ,i)) {
				count++;//here count is used for index size only bcoz when duplicates removed size decrease
			}           //if we dont change size then the remaining places are placed with zero.
		}
		int[] res=new int[count];//for storing result and also we are taking count as size bcoz if we take size then the dupliactes size place are removed and 0 value is appeared to dectease size we use count index incremented all time
		for(int i=0,j=0;i<size;i++) {
			if(checkDuplicate(obj, occ, i)) {
				res[j]=obj[i];
				j++;
			}
		}
		System.out.println("the elements after removing duplicates: ");
		System.out.print("[");
		for(int a:res) {
			System.out.print(a+" ");
		}
		System.out.println("]");
		
	}
	public static boolean checkDuplicate(int obj[],int occ[],int i) {
		int count=1;
		for(int j=i+1;j<obj.length;j++) {
			if(obj[i]==obj[j]) {
				count++;
				occ[j]=1;
			}
			
		}
		if(count>=1&& occ[i]!=1) {
			return true;
		}
		
		return false;
	}

}
