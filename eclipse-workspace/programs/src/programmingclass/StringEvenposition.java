package programmingclass;

public class StringEvenposition {

	public static void main(String[] args) {
		String s="abcdefgh";
		String res= "";
		String odd="";
		
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
			res=res+s.charAt(i);
			}
			else {
				odd=odd+s.charAt(i);
			}
			
			
		}
		res=res+odd;
		System.out.println(res);

	}

}
