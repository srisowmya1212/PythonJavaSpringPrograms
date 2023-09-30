package programmingclass;

public class RemoveIsString {
	public static void main(String[] args) {
		String s = "This is java";
		String res = "";
		String str = "";
	

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='i'||s.charAt(i)=='s') {
			
				continue;
			}
			else {
				res=res+s.charAt(i);
			}
			
         

		}
		//str=res+" "+s.substring(8);
		
		System.out.println(res);

	}

}
