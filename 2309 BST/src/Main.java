import java.util.Scanner;

// Fall 2014
// http://poj.org/problem?id=2309
// Accepted with 5236K 438MS

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < count; i++) {
			int root = Integer.parseInt(sc.nextLine());

			int pow = 1;
			while ((root / pow) % 2 == 0) {
				pow *= 2;
			}
			
			int min = root - pow + 1;
			int max = root + pow - 1;
			
			System.out.println(min + " " + max);
		}
	}
}
