import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cases = Integer.parseInt(sc.nextLine());

		for (int count = 0; count < cases; count++) {

			String line = sc.nextLine();
			String split[] = sc.nextLine().split(" ");
			int nSkeeters = Integer.parseInt(split[0]);
			Skeeter skeeters[] = new Skeeter[nSkeeters];
			double diameter = Double.parseDouble(split[1]);
			for (int i = 0; i < nSkeeters; i++) {
				split = sc.nextLine().split(" ");
				double x = Double.parseDouble(split[0]);
				double y = Double.parseDouble(split[1]);
				skeeters[i] = new Skeeter(x, y);
			}
		}

	}

	public static class Skeeter {
		public double x;
		public double y;

		public Skeeter(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

}
