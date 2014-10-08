import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] split = sc.nextLine().split(" ");

			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);

			if (a == 0 && b == 0) {
				return;
			}

			// if (split[0].equals(split[1])) {
			// return;
			// }

			System.out.println(a / b + " " + a % b + " / " + b);
		}

	}

}
