package codeUp.test1098;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		String[] strArray = str.split(" ");

		int w = Integer.parseInt(strArray[0]);
		int h = Integer.parseInt(strArray[1]);

		int[][] array = new int[w][h];

		int n = Integer.parseInt(input.nextLine());

		str = "";
		strArray = null;
		for(int i=0; i<n; i++) {
			str = input.nextLine();
			strArray = str.split(" ");

			int l = Integer.parseInt(strArray[0]);
			int d = Integer.parseInt(strArray[1]);
			int x = Integer.parseInt(strArray[2]);
			int y = Integer.parseInt(strArray[3]);

			if(d == 0) {
				for(int j=y-1; j<y-1+l; j++) {
					array[x-1][j] = 1;
				}
			}else {
				for(int j=x-1; j<x-1+l; j++) {
					array[j][y-1] = 1;
				}
			}
		}
		String tmp = "";
		for(int i=0; i<w; i++) {
			for(int j=0; j<h; j++) {
				tmp += array[i][j];
				if(j != h) {
					tmp += " ";
				}
				System.out.print(tmp);
				tmp = "";
			}
			System.out.println();
		}
	}
}

