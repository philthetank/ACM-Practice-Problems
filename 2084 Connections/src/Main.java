import java.math.BigInteger;
import java.util.Scanner;

/*** work in progress ***/

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long pairs = Long.parseLong(sc.nextLine());
		while (pairs != -1) {
			System.out.println(d(pairs));
			pairs = Long.parseLong(sc.nextLine());
		}
	}

	public static BigInteger bc(long n, long k) {
		BigInteger result = 1;
		
		if (k > n - k) {
			k = n - k;
		}

		for (long i = 0; i < k; i++) {
			result.multiply() //*= (n - i);
			result /= (i + 1);
		}

		return result;
	}

	public static BigInteger d(long n) {
		BigInteger result = bc(2 * n, n);
		return result / (n + 1);
	}
}
