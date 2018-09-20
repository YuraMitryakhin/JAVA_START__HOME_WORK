package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w;

		System.out.print("Enter width:");
		w = sc.nextInt();

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < w; j++) {
				if ((i == j) || (i <= j) ^ (Math.abs(i - w + 1) <= j)
						|| (Math.abs(i - w + 1) == j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
