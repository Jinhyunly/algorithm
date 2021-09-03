package codeUp.test1099;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int[][] array = new int[10][10];

		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = input.nextInt();
			}
		}

		int x = 1;
		int y = 1;

		while (true) {
			if(array[x][y] == 0) {
				array[x][y] = 9;
				y++;
			}

			if(array[x][y] == 1) {
				x++;
				y--;
			}

			if(array[x][y] == 2) {
				array[x][y] = 9;
				break;
			}

			if(array[x][y+1] == 1 && array[x+1][y] ==1) {
				if(array[x][y] == 0) {
					array[x][y] = 9;
				}else {
					break;
				}
			}
		}

		for(int[] arr : array) {
			for(int q : arr) {
				System.out.print(q + " ");
			}
			System.out.println();
		}
	}
}

