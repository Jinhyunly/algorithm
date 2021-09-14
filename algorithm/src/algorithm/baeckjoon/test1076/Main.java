package algorithm.baeckjoon.test1076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		Map<String, Integer> colorMap = new HashMap<String, Integer>();
		colorMap.put("black", 0);
		colorMap.put("brown", 1);
		colorMap.put("red", 2);
		colorMap.put("orange", 3);
		colorMap.put("yellow", 4);
		colorMap.put("green", 5);
		colorMap.put("blue", 6);
		colorMap.put("violet", 7);
		colorMap.put("grey", 8);
		colorMap.put("white", 9);

		String result = "";
		String head = "";
		for(int i=0; i<3; i++) {
			if(i==2) {
				result = (long)(Long.parseLong(head) * Math.pow(10, colorMap.get(input.readLine()))) +"";
				break;
			}
			head += colorMap.get(input.readLine());
		}

		System.out.println(result);
	}
}
