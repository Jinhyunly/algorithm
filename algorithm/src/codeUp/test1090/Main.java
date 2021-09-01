package codeUp.test1090;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] strArray = input.nextLine().split(" ");

		Long a = Long.parseLong(strArray[0]);
		int r = Integer.parseInt(strArray[1]);
		int n = Integer.parseInt(strArray[2]);

		for(int i=1; i<n; i++) {
			a *= r;
		}
		System.out.println(a);

	}
}
