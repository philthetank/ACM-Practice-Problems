import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int count = sc.nextInt();
		int partition[] = new int[count + 2];
		partition[0] = 0;
		partition[partition.length - 1] = width;
		for (int i = 1; i <= count; i++) {
			partition[i] = sc.nextInt();
		}

		TreeSet<Integer> widths = new TreeSet<Integer>();

		for (int i = 0; i < partition.length; i++) {
			for (int j = 0; j < partition.length; j++) {
				if (i <= j) {
					continue;
				}

				widths.add(partition[i] - partition[j]);
			}
		}

		for (int i : widths) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
