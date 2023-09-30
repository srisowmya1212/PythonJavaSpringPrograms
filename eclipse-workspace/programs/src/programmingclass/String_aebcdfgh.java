package programmingclass;

public class String_aebcdfgh {
	public static void main(String[] args) {
		String s="abcdefgh";
		String res="";
		String v="aeiouAEIOU";
		String vowel="",consonant="";
//		String r=s;
//	
//		for(int i=0;i<s.length();i++) {
//			if(i==1) {
//				res=res+s.charAt(4);
//				
//				
//			}
//			else if(i==4) {
//				continue;
//			}
//			else{
//			
//				res=res+r.charAt(i);
//				
//			}
//		}
//		
//		System.out.println(res);
		
		for(int i=0;i<s.length();i++) {
			if(v.indexOf(s.charAt(i))==-1) {
				consonant=consonant+s.charAt(i);
			}else {
				vowel=vowel+s.charAt(i);
			}
		}
		res=vowel+consonant;
		System.out.println(res);
	
	}

}
