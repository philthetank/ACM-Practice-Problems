import java.util.Scanner;

// Fall 2014
// http://poj.org/problem?id=1160
// Work in progress

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nVillage = sc.nextInt();
		int nPostOffice = sc.nextInt();

		int butts = 0;
		
		int village[] = new int[nVillage];
		for (int i = 0; i < village.length; i++) {
			village[i] = sc.nextInt();
		}

		// int postOffice[] = new int[nPostOffice];
		// for (int i = 0; i < postOffice.length; i++) {
		// postOffice[i] = Integer.MAX_VALUE;
		// }
		



		int d[] = new int[nVillage];
		for (int i = 0; i < d.length; i++) {
			d[i] = Integer.MAX_VALUE;
		}

	}
}
