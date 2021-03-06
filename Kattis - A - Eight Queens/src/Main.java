import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean y[] = new boolean[8];

		Scanner sc = new Scanner(System.in);

		int positiveSlope[] = new int[8];
		int negativeSlope[] = new int[8];

		int queen = 0;

		for (int i = 0; i < 8; i++) {
			String split[] = sc.nextLine().split("");

			boolean xSoFar = false;

			for (int j = 0; j < 8; j++) {

				if (split[j + 1].equals("*")) {
					if (xSoFar || y[j]) {
						System.out.println("invalid");
						return;
					} else {
						xSoFar = true;
						y[j] = true;
					}

					positiveSlope[queen] = j - i;
					negativeSlope[queen] = j + i;
					queen++;
				}
			}
		}

		Arrays.sort(positiveSlope);
		Arrays.sort(negativeSlope);

		int last = Integer.MAX_VALUE;
		for (int i : positiveSlope) {
			if (last == i) {
				System.out.println("invalid");
				return;
			}

			last = i;
		}

		last = Integer.MAX_VALUE;
		for (int i : negativeSlope) {
			if (last == i) {
				System.out.println("invalid");
				return;
			}

			last = i;
		}

		System.out.println("valid");
	}
}
