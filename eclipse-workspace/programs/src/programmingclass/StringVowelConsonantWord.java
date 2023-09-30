package programmingclass;

public class StringVowelConsonantWord {
	public static void main(String[] args) {
		String s = "This is Java and my name is Ambani";
		String[] words = s.split(" ");
		String v = "aeiouAEIOU";
		String vowel = " ";
		String consonant=" ";
		String res="";
		
			for (int j = 0; j < words.length; j++) {
				if (v.indexOf(words[j].charAt(0)) != -1) {
					vowel = vowel + words[j]+ " ";
				}
				else {
					consonant=consonant+words[j]+" ";
				}
			}
			res=vowel+consonant;
			res.trim();//to remove extra spaces at trail and leading
			System.out.println(res);
		
		

	}

}
