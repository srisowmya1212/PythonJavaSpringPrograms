package programmingclass;

public class String_AbCdEfGh {
	public static void main(String[] args) {
        String s="abcdefgh";
        
        String res="";
        String even="";
        String odd="";
//        for(int i=0;i<s.length();i++) {
//        	
//        	if(i%2==0) {
//        	 String r=s.toUpperCase();
//        		res=res+r.charAt(i);
//        	        	}
//        	else {
//           String l=s.toLowerCase();
//        		res=res+l.charAt(i);
//        	}
//        }
//        System.out.println(res);
        for(int i=0;i<s.length();i++) {
        	if(i%2==0) {
        		even=even+s.charAt(i);
        	}
        	else {
        		odd=odd+s.charAt(i);
        	}
        } 
        even=even.toUpperCase();
        odd=odd.toLowerCase();
        int m=0,n=0;
        for(int i=0;i<s.length();i++) {
        	if(i%2==0) {
        		res=res+even.charAt(m++);
        	}
        	else {
        		res=res+odd.charAt(n++);
        	}
        }
        System.out.println(res);
        	
     
	}
}
