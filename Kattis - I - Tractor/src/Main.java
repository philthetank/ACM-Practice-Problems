import java.awt.Point;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static Point max_point;

	public static HashSet<Point> points = new HashSet<Point>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {

			int max_x = sc.nextInt();
			int max_y = sc.nextInt();
			max_point = new Point(max_x, max_y);
			tractor(0, new Point(0, 0));

			System.out.println(points.size());

		}
	}

	public static void tractor(int pow, Point pos) {

		if (points.contains(pos)) {
			return;
		}

		if (pos.x <= max_point.x & pos.y <= max_point.y) {
			points.add(pos);
		}

		int distance = (int) Math.pow(2, pow);

		if (pos.x <= max_point.x) {
			tractor(pow + 1, new Point(pos.x + distance, pos.y));
		}

		if (pos.y <= max_point.y) {
			tractor(pow + 1, new Point(pos.x, pos.y + distance));
		}

	}
}
