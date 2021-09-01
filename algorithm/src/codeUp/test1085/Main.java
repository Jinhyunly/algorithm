package codeUp.test1085;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] strArray = input.nextLine().split(" ");

		int hz = Integer.parseInt(strArray[0]);
		int bit = Integer.parseInt(strArray[1]);
		int ch = Integer.parseInt(strArray[2]);
		int sec = Integer.parseInt(strArray[3]);

		if(hz<=48000 && bit<=32 && bit%8==0  && ch<=5 && sec <=6000) {
			double result =  ((double)hz * bit * ch * sec) / 8 / 1024 / 1024;
			System.out.println(Math.round(result*10)/10.0 + " MB");
		}
	}
}
