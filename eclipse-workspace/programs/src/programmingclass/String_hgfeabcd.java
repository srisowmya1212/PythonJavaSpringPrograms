package programmingclass;

public class String_hgfeabcd {
	public static void main(String[] args) {
		String s = "abcdefgh";
		String res = "";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			if (i ==4) {
				for (int j = s.length() - 1; j >= 0; j--) {
					if (j >= 4) {
						rev = rev + s.charAt(j);
						

					}
				}

			} else if(i>=0 &&i<=4) {
			
				res = res + s.charAt(i);
				
			}
		}
		rev = rev + res;
		System.out.println(rev);
	}

}
