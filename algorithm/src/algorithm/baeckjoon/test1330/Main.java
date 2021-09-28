package algorithm.baeckjoon.test1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = input.readLine().split(" ");

		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[1]);

		String str = "";

		if(num1 < num2) {
			str = "<";
		}else if(num1 > num2) {
			str = ">";
		}else {
			str = "==";
		}
		System.out.println(str);
	}
}
