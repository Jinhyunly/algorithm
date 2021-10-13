package algorithm.baeckjoon.test14681;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int x = Integer.parseInt(input.readLine());
		int y = Integer.parseInt(input.readLine());

		if(x>0 && y>0) {
			out.write("1");
		}else if(x>0 && y<0) {
			out.write("4");
		}else if(x<0 && y>0) {
			out.write("2");
		}else if(x<0 && y<0) {
			out.write("3");
		}
		out.flush();
	}
}
