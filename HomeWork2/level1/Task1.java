package com.gmail.yuramitryahin;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		int max;

		System.out.print("Enter first number:");
		num1 = sc.nextInt();
		System.out.print("Enter second number:");
		num2 = sc.nextInt();
		System.out.print("Enter third number:");
		num3 = sc.nextInt();
		System.out.print("Enter fourth number:");
		num4 = sc.nextInt();

		max = num1;
		if (max < num2) {
			max = num2;
		} else if (max < num3) {
			max = num3;
		} else if (max < num4) {
			max = num4;
		}

		System.out.println("Max value:" + max);
	}

}
