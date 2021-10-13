package algorithm.baeckjoon.test2753;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int year = Integer.parseInt(input.readLine());

		if((year%4 ==0 && year%100 != 0) || year%400 ==0) {
			out.write("1");
		}else {
			out.write("0");
		}
		out.flush();

	}

}
