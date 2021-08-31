package codeUp.test1084;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] strArray = in.readLine().split(" ");
		int c=0;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < Integer.parseInt(strArray[0]); i++) {
			for (int j = 0; j < Integer.parseInt(strArray[1]); j++) {
				for (int k = 0; k < Integer.parseInt(strArray[2]); k++) {
					bw.write((i + " " + j + " " + k +"\n"));
					c++;
				}
			}
		}
		bw.write(c+"");
		bw.flush();
	}
}
