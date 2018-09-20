package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int n6;

		System.out.print("Enter your number: ");
		num = sc.nextInt();
		n1 = num / 100000;
		n2 = num % 100000 / 10000;
		n3 = num % 10000 / 1000;
		n4 = num % 1000 / 100;
		n5 = num % 100 / 10;
		n6 = num % 10;

		if (n1 == n6 && n2 == n5 && n3 == n4) {
			System.out.println("This number is a panorama!");
		} else {
			System.out.println("This number isn't a panorama!");
		}
	}

}
