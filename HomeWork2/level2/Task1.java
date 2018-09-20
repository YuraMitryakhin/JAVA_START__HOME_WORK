package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 4;
		int x;
		int y;
		double d;

		System.out.print("Enter x: ");
		x = sc.nextInt();
		System.out.print("Enter y: ");
		y = sc.nextInt();

		d = Math.sqrt(x * x + y * y);

		if (d <= r) {
			System.out.println("Point belongs to the circle!");
		} else {
			System.out.println("Point doesn't belongs to the circle!");
		}

	}

}
