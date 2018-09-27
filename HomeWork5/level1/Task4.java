package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int[] mas = new int[] { 1, 3, 5, 8, 9, 0, 2, 4, 6, 7 };
		int f = 4;
		System.out.println("Index elment = " + findNum(mas, f));

	}

	public static int findNum(int[] arr, int fn) {
		for (int i = 0; i < arr.length; i++) {
			if (fn == arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
