package com.gmail.yuramitryahin;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		printStatistic();

	}

	public static String readFile() {
		StringBuilder text = new StringBuilder();
		File file = new File("text.txt");
		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				text.append(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return text.toString();
	}

	public static int[] characterCount() {

		String text = readFile();
		int k;
		int[] arr = new int[124];

		for (int i = 0; i < text.length(); i++) {
			k = (int) text.charAt(i);
			if (k >= 65 && k <= 90) {
				for (int j = 65; j <= 90; j++) {
					if (j == k) {
						arr[j]++;
					}
				}
			}
			if (k >= 97 && k <= 122) {
				for (int j = 97; j <= 122; j++) {
					if (j == k) {
						arr[j]++;
					}
				}
			}
		}
		return arr;
	}

	public static void printStatistic() {
		int[] mas = characterCount();
		int[] sortArr = new int[26];
		int k;
		for (int i = 0; i <= 25; i++) {
			mas[65 + i] += mas[97 + i];
			sortArr[i] = mas[65 + i];
		}
		Arrays.sort(sortArr);
		for (int j = 0; j <= 25; j++) {
			for (int i = 65; i <= 90; i++) {
				if (sortArr[25 - j] == mas[i]) {
					System.out.println((char) i + "=" + mas[i]);
				}
			}
		}
	}

}
