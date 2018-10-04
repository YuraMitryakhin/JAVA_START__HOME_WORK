package com.gmail.yuramitryahin;

import java.io.File;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		File file = new File(inputWay());
		showDirectory(file);
	}

	public static void showDirectory(File file) {
		File[] arrFile = file.listFiles(File::isDirectory);

		for (File f : arrFile) {
			System.out.println(f);
		}
	}

	public static String inputWay() {
		String way;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter way and name of directory:");
		return way = sc.nextLine();
	}

}
