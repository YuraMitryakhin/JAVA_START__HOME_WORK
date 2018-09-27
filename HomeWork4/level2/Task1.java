package com.gmail.yuramitryahin;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 6;
		int l = 0;
		int k;
		int[][] mas = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mas[i][j] = j + 1;
			}
		}

		print(mas, n);
		System.out.println("Enter an angle(1-3):\n1 - 90 degrees\n2 - 180 degrees\n3 - 270 degrees");
		k = sc.nextInt();
		if (k == 1) {
			turn90(mas, n);
			print(mas, n);
		} else if (k == 2) {
			turn180(mas, n);
			print(mas, n);
		} else if (k == 3) {
			turn270(mas, n);
			print(mas, n);
		} else {
			System.out.println("Eror!");
		}

	}

	public static void print(int[][] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static int[][] turn90(int[][] arr, int n) {
		int l = 0;
		int k;
		for (int i = l; i < n; i++) {
			for (int j = l; j < n; j++) {
				k = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = k;
			}
			l++;
		}
		return arr;
	}

	public static int[][] turn180(int[][] arr, int n) {
		int k;
		for (int i = 0; i < n; i++) {
			int l = 1;
			for (int j = 0; j < n / 2; j++) {
				k = arr[i][j];
				arr[i][j] = arr[i][n - l];
				arr[i][n - l] = k;
				l++;
			}
		}
		return arr;
	}

	public static int[][] turn270(int[][] arr, int n) {
		return turn90(turn180(arr, n), n);
	}

}
