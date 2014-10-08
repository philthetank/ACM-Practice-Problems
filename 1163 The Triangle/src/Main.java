import java.util.Scanner;

// Fall 2014
// http://poj.org/problem?id=1163
// Accepted with 5272K and 1047MS

public class Main {

	public static int globalMax = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();

		// create array for triangle data
		int triangle[][] = new int[base][base];

		// create array for memoization
		int max[][] = new int[base][base];

		// populate triangle
		for (int i = 0; i < base; i++) {
			for (int j = 0; j <= i; j++) {
				triangle[i][j] = sc.nextInt();
			}
		}

		// seed the triangle
		max[0][0] = triangle[0][0];

		// do DP
		for (int row = 1; row < base; row++) {
			for (int col = 0; col <= row; col++) {
				int right = max[row - 1][col];

				// don't go OOB. Set left to 0 if OOB.
				int leftCol = col - 1;
				int left = (leftCol >= 0 ? max[row - 1][leftCol] : 0);

				int localMax = Math.max(left, right) + triangle[row][col];
				max[row][col] = localMax;

				// update global max
				if (localMax > globalMax) {
					globalMax = localMax;
				}
			}
		}

		// output
		System.out.println(globalMax);
	}
}
