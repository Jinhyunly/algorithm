package algorithm.baeckjoon.test2739;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(input.readLine());

		for(int i=1; i<10; i++) {
			out.write(num+" * "+i+" = "+num*i +"\n");
		}
		out.flush();
	}
}
