package com.gmail.yuramitryahin;

public class Task1 {

	public static void main(String[] args) {
		int[] mas = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		int k = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 1) {
				k++;
			}
		}

		System.out.println("Number of odd digits: " + k);
	}

}
