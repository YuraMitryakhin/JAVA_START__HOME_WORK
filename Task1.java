package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int number;
		int result;

		System.out.print("Enter your number: ");
		number = scan.nextInt();
		System.out.println("Your number: ");
		result = number / 10000;
		System.out.println(result);
		result = number % 10000 / 1000;
		System.out.println(result);
		result = number % 1000 / 100;
		System.out.println(result);
		result = number % 100 / 10;
		System.out.println(result);
		result = number % 10;
		System.out.println(result);
	}
}