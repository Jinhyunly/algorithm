package algorithm.baeckjoon.test1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());

		for(int j=0; j<T; j++) {
			int N = Integer.parseInt(in.readLine());
			int[] zero = new int[41];
			int[] one = new int[41];

			zero[0] = 1;
			zero[1] = 0;

			one[0] = 0;
			one[1] = 1;

			for(int i=2; i<=N; i++) {
				zero[i] += zero[i-1] + zero[i-2];
				one[i] += one[i-1] + one[i-2];
			}
			System.out.println(zero[N]+" "+one[N]);
		}
	}
}
