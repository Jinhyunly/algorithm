package codeUp.test1097;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int n, x, y;
		int[][] a = new int[19][19];

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				a[i][j] = input.nextInt();
			}
		}
		n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			x = input.nextInt();
			for (int j = 0; j < 19; j++) {
				if (a[x - 1][j] == 0) {
					a[x - 1][j] = 1;
				} else {
					a[x - 1][j] = 0;
				}
			}
			y = input.nextInt();
			for (int j = 0; j < 19; j++) {
				if (a[j][y - 1] == 0) {
					a[j][y - 1] = 1;
				} else {
					a[j][y - 1] = 0;
				}
			}
		}

		for (int[] arr : a) {
			for (int q : arr) {
				System.out.print(q + " ");
			}
			System.out.println();
		}
	}
}
