package programmingclass;

public class StringUpperCase {
	public static void main(String[] args) {
		String s = "This is java";
		String words[] = s.split(" ");
		String res = "";

		for (int i = 0; i < words.length; i++) {
			res = res + (words[i].charAt(0)+"").toUpperCase() + (words[i].substring(1)) + " ";

		}
		System.out.println(res);

	}

}
