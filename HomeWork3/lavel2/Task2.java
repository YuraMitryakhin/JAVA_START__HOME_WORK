package com.gmail.yuramitryahin;

public class Task2 {

	public static void main(String[] args) {
		boolean b = true;

		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b)
				System.out.println(i);
			else
				b = true;
		}

	}

}
