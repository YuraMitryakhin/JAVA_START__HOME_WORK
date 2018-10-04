package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int n = 10;
		int m;

		System.out.print("Input first velue:");
		n = input();
		System.out.print("Input second velue:");
		m = input();

		System.out.println("Hamming distance=" + result(n, m));

	}

	public static int input() {
		int vel;
		Scanner sc = new Scanner(System.in);
		return vel = sc.nextInt();
	}

	public static int result(int n, int m) {
		int max;
		int k = 0;
		String velN = binaryResult(n);
		String velM = binaryResult(m);

		for (int i = 0; i < velN.length(); i++) {
			if (velN.charAt(i) != velM.charAt(i)) {
				k++;
			}
		}

		return k;
	}

	public static String binaryResult(int vel) {
		String st = Integer.toBinaryString(vel);
		String stb = "";
		if (st.length() < 8) {
			for (int i = 0; i < 8 - st.length(); i++) {
				stb += "0";
			}
		}
		return stb += st;
	}

}
