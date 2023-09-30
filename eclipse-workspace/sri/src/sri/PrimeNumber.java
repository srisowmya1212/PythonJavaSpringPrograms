package sri;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the start number of primes to check  ");
		int start = sc.nextInt();
		System.out.println("enter the end number of prime to check  ");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {

				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {

			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}

}
