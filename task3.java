package com.gmail.yuramitryahin;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double C;
		double r;

		System.out.print("Enter radius of a circle: ");
		r = scan.nextDouble();
		C = 2 * Math.PI * r;
		System.out.println("Ñircumference: " + C);
	}
}
