package programmingclass;

public class ReverseStringFirstUpperCase {

	public static void main(String[] args) {
		String s="This is java";
		s=s.toLowerCase();
		String[] split=s.split(" ");
		String revstr="";
		String res="";
		for(int i=0;i<split.length;i++) {
		String	word=split[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
			}
			revstr=revstr+revword+" ";
		}
		System.out.println(revstr);
		//to capitalize first letter
		String[] splitted=revstr.split(" ");
		for(int i=0;i<splitted.length;i++) {
			res=res+(splitted[i].charAt(0)+"").toUpperCase()+(splitted[i].substring(1)+" ");
		}
		System.out.println(res);
	}

}
