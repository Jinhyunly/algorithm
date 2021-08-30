package algorithm.baeckjoon.test1001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n1 = input.nextInt();
		int n2 = input.nextInt();

		if (n1 > 0 && n2 < 10) {
			System.out.println(n1 - n2);
		}
	}
}
