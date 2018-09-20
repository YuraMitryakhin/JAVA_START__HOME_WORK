package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int fl;

		System.out.print("Enter apartment number:");
		num = sc.nextInt();
		fl = (int) (num / 4.0 + 0.95);

		if (num < 0 || num > 144) {
			System.out.println("Apartment " + num + " not found!");
		} else if (num < 37) {
			System.out.println("Entrance 1, apartment " + fl);
		} else if (num < 73) {
			System.out.println("Entrance 2, apartment " + (fl - 9));
		} else if (num < 109) {
			System.out.println("Entrance 3, apartment " + (fl - 18));
		} else if (num < 145) {
			System.out.println("Entrance 4, apartment " + (fl - 27));
		}

	}

}
