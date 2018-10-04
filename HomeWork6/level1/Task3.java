package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int n;
		n = input();
		System.out.println("(" + result(n) + "->" + n + ")");
	}

	public static int input() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number in the binary system:");
		num = sc.nextInt();
		return num;
	}

	public static int result(int num) {
		int r = 0;
		String st = Integer.toString(num);
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) % 2 == 1) {
				r += (int) Math.pow(2, i);
			}
		}
		return r;
	}

}
