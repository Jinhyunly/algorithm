package algorithm.baeckjoon.test1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] numArray = in.readLine().split(" ");

		System.out.println((double)Integer.parseInt(numArray[0])/Integer.parseInt(numArray[1]));
	}

}
