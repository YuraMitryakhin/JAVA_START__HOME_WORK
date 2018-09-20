package com.gmail.yuramitryahin;

public class Task3 {

	public static void main(String[] args) {
		int tck = 2433;
		int num1;
		int num2;
		int num3;
		int num4;

		num1 = tck / 1000;
		num2 = tck % 1000 / 100;
		num3 = tck % 100 / 10;
		num4 = tck % 10;

		if (num1 + num2 == num3 + num4) {
			System.out.println("Congratulations!You have lucky ticket!");
		} else {
			System.out.println("Good luck another time!");
		}

	}

}
