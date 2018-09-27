package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int k = 0;

		System.out.print("Enter your text:");
		str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			if (s == 'b') {
				k++;
			}
		}
		System.out.println("The symbol 'b' occurs " + k + " time");
	}

}
