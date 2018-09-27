package com.gmail.yuramitryahin;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		int n = 9;
		int k;
		int[] mas = new int[n];

		for (int i = 0; i < n; i++) {
			mas[i] = (int) (Math.random() * 10);
		}

		System.out.println(Arrays.toString(mas));

		for (int i = 0; i < n / 2; i++) {
			k = mas[i];
			mas[i] = mas[n - 1 - i];
			mas[n - 1 - i] = k;
		}
		System.out.println(Arrays.toString(mas));
	}

}
