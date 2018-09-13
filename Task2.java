package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = 5;
		int b = 7;
		int c = 6;
		double p;
		double s;

		p = (a + b + c) / 2;
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("S = " + s);
	}
}
