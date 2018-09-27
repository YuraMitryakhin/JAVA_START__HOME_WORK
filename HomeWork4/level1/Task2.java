package com.gmail.yuramitryahin;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		System.out.print("Enter array size:");
		N = sc.nextInt();
		int[] mas = new int[N];

		for (int i = 0; i < mas.length; i++) {
			System.out.print("Enter the " + i + " value of the array = ");
			mas[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(mas));
	}

}
