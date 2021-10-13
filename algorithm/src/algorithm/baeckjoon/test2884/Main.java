package algorithm.baeckjoon.test2884;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

	String[] str = input.readLine().split(" ");
	int hour = Integer.parseInt(str[0]);
	int min = Integer.parseInt(str[1]);

	if(min-45 >= 0) {
		out.write(hour +" " + (min-45));
	}else {
		if(hour == 0) {
			out.write((24-1) +" " + (60+min-45));
		}else {
			out.write((hour-1) +" " + (60+min-45));
		}
	}
		out.flush();
	}
}
