package com.gmail.yuramitryahin;

public class Task2 {

	public static void main(String[] args) {
		int[] mas = new int[] { 1, 2, 3, 4, 5 };

		System.out.println(printArray(mas));
	}

	public static String printArray(int[] mas) {
		String st = "[";

		for (int i = 0; i < mas.length; i++) {
			st += mas[i];
			if (i < mas.length - 1) {
				st += ",";
			}
		}

		st += "]";
		return st;
	}

}
