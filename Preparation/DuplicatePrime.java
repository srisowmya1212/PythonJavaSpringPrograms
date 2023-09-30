package sri;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicatePrime {
	public static void main(String[] args) {
		int a[]= {2,5,8,7,1,0,9,5,2};
		int oc[]=new int[a.length];
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(checkDuplicate(a,oc,i)) {
				c++;
			}
			
		}
		int res[]=new int[c];
		for(int i=0,j=0;i<a.length;i++) {
			if(checkDuplicate(a, oc, i)) {
				res[j]=a[i];
				j++;
			}
		}
		for(int i:res) {
			System.out.println(i);
		}
	  	
			
		
	}
	public static boolean checkDuplicate(int a[],int oc[],int ind) {
		int c=1;
		for(int j=ind+1;j<a.length;j++) {
			if(a[ind]==a[j]) {
				c++;
				oc[j]=1;
			}
		}
		if(c>=1 && oc[ind]!=1 && prime(a[ind])) {
			return true;
		}
		return false;
	}
	public static boolean prime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		}
		return count==2;
	}
	
}