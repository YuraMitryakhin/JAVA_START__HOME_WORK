package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h;
		int w;

		System.out.print("Enter height: ");
		h = sc.nextInt();
		System.out.print("Enter width:");
		w = sc.nextInt();

		for (int i = 1; i <= h; i++) {
			if (i == 1 || i == h) {
				for (int j = 1; j <= w; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= w; j++) {
					if (j == 1 || j == w) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}

	}

}
