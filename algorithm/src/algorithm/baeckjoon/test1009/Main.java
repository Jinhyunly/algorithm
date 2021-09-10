package algorithm.baeckjoon.test1009;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int intCnt = Integer.parseInt(input.readLine());

		for (int i = 0; i < intCnt; i++) {
			String[] array = input.readLine().split(" ");
			int result = 1;
			int count = Integer.parseInt(array[1]);
			int num = Integer.parseInt(array[0]);
			if (num == 0 || num == 1 || num == 5 || num == 6) {
				result = num;
			}else {
				for (int j = 0; j < count; j++) {
					result = result * num;
					if (result % 10 == 0) {
						result= 10;
						break;
					}
					result %= 10;
				}
			}
			bw.write(result + "\n");
			bw.flush();
		}
	}
}
