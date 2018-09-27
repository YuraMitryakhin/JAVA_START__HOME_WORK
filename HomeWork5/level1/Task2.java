package com.gmail.yuramitryahin;

public class Task2 {

	public static void main(String[] args) {
		int num1 = 2;
		double num2 = 3.2;
		String st = ("Your amount = ");

		System.out.println(concatenation(num1, num2, st));
	}

	public static String concatenation(int n1, double n2, String s) {

		return s + (n1 + n2);
	}
}
