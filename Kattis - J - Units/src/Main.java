import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nUnits = Integer.parseInt(sc.nextLine());

		while (nUnits != 0) {
			String unitNames[] = sc.nextLine().split(" ");
			Unit units[] = new Unit[nUnits];
			for (int i = 0; i < nUnits; i++)
				units[i] = new Unit(unitNames[i]);
		}

		for (int i = 0; i < nUnits - 1; i++) {

		}
		// print

		// new loop
		nUnits = Integer.parseInt(sc.nextLine());
	}

	public static class Unit {
		public String name;

		public Unit(String n) {
			name = n;
		}
	}

	public static class Connection {
		public Unit parent;
		public Unit child;
		public int weight;

		public Connection(Unit p, Unit c, int w) {
			parent = p;
			child = c;
			weight = w;
		}
	}
}
