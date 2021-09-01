package codeUp.test1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(in.readLine());
		String[] strArray = in.readLine().split(" ");

		String str = "";
		for(int i=(count-1); i>=0; i--) {
			str += strArray[i];
			if(i!=0) {
				str += " ";
			}
		}
		System.out.println(str);
	}
}
