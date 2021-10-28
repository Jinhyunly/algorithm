package algorithm.baeckjoon.test10871;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] nx = input.readLine().split(" ");
		String[] nums = input.readLine().split(" ");

		String str = "";
		for(int i=0; i<Integer.parseInt(nx[0]); i++) {
			if(Integer.parseInt(nums[i])<Integer.parseInt(nx[1])) {
				str += nums[i] +" ";
			}
		}
		out.write(str);
		out.flush();
	}
}