package algorithm.baeckjoon.test2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();

		int count = Integer.parseInt(input.readLine());
		List<Integer> list = new ArrayList<Integer>();


		for(int i=0; i< count; i++) {
			list.add(Integer.parseInt(input.readLine()));
		}
		Collections.sort(list);

		for(int n : list) {
			sb.append(n).append("\n");
		}
		System.out.println(sb);
	}
}
