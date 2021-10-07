package algorithm.baeckjoon.test2588;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int num1 = Integer.parseInt(input.readLine());
		int num2 = Integer.parseInt(input.readLine());

		out.write((num1 * (num2%10)) +"\n" + (num1 * ((num2/10)%10)) +"\n" + (num1 * (num2/100)) +"\n" + num1*num2);
		out.flush();
	}
}
