package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h;
		String st = "";

		System.out.print("Enter height:");
		h = sc.nextInt();

		for (int i = 0; i <= 2 * h; i++) {
			if (i <= h) {
				st = st + "*";
				System.out.println(st);
			} else {
				st = st.substring(1);
				System.out.println(st);
			}
		}

	}

}
