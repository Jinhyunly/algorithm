package algorithm.baeckjoon.test10430;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] nums = input.readLine().split(" ");
		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[1]);
		int num3 = Integer.parseInt(nums[2]);

		out.write(((num1+num2)%num3) + "\n" + ((num1%num3) + (num2%num3))%num3 + "\n" + (num1*num2)%num3 + "\n" + ((num1%num3) * (num2%num3))%num3);
		out.flush();
	}
}
