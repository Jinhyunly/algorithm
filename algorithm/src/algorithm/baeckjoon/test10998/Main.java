package algorithm.baeckjoon.test10998;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] strNums = input.readLine().split(" ");
		int result = Integer.parseInt(strNums[0]) *  Integer.parseInt(strNums[1]);
		System.out.println(result);
	}
}
