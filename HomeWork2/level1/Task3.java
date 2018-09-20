package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;

		System.out.print("Enter year:");
		year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("This year has 366 days");
		} else {
			System.out.println("This year has 365 days");
		}
	}
}
