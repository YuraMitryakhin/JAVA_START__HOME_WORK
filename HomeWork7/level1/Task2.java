package com.gmail.yuramitryahin;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Task2 {

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = fillingArr(n);

		writeFile(mas);

	}

	public static int[][] fillingArr(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
			}
		}
		return arr;
	}

	public static void writeFile(int[][] arr) {
		try (PrintWriter file = new PrintWriter("Array.txt")) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					file.print(arr[i][j] + " ");
				}
				file.println("");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}

}
