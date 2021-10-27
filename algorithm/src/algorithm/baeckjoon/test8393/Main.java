package algorithm.baeckjoon.test8393;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(input.readLine());
		for(int i=n-1; i>=1; i--) {
			n += i;
		}
		out.write(n+"");
		out.flush();
	}
}
