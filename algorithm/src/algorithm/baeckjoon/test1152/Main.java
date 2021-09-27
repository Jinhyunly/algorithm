package algorithm.baeckjoon.test1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] strA =  in.readLine().split(" ");
		int count = 0;

		for(int i=0; i<strA.length; i++) {
			if(!strA[i].equals("")) {
				count++;
			}
		}

		System.out.println(count);
	}
}
