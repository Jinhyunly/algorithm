package algorithm.baeckjoon.test1145;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int[] numArray = new int[5];

		String[] array = input.readLine().split(" ");
		numArray[0] = Integer.parseInt(array[0]);
		int min = numArray[0];

		for(int i=1; i<numArray.length; i++) {
			numArray[i] = Integer.parseInt(array[i]);
			if(min > numArray[i]) {
				min = numArray[i];
			}
		}

		int count = 0;

		while(true) {
			for(int i=0; i<numArray.length; i++) {
				if(min%numArray[i]==0) count++;
			}
			if(count>=3) break;
			count=0;
			min++;
		}
		System.out.println(min);
	}
}
