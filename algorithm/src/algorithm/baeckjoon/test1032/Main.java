package algorithm.baeckjoon.test1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(input.readLine());

		char[] firstStr = input.readLine().toCharArray();

		for(int i=1; i<n; i++) {
			char[] nextStr = input.readLine().toCharArray();

			for(int j=0; j<firstStr.length; j++) {
				if(firstStr[j] != nextStr[j]) {
					firstStr[j] = '?';
				}
			}
		}
		System.out.println(String.valueOf(firstStr));
	}
}
