package algorithm.baeckjoon.test2439;

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
		String star = "";

		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				star += " ";
			}

			for(int j=0; j<=i; j++) {
				star += "*";
			}
			out.write(star+"\n");
			star="";
		}
		out.flush();
	}
}
