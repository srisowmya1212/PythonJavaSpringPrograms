package programmingclass;

public class StringPrimePosition {

	public static void main(String[] args) {
		String s = "abcdefgh";
		String res = "";
		String prime = "";
		for (int i = 0; i < s.length(); i++) {
			if (isprime(i)) {
				prime = prime + s.charAt(i);
			} else {
				res = res + s.charAt(i);

			}
		}
		res = prime + res;
		System.out.println(res);

	}

	public static boolean isprime(int n) {
		int factor = 1;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				factor++;
			}
		}
		return factor == 2;
	}

}
