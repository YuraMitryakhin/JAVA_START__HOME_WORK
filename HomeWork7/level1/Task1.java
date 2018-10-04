package com.gmail.yuramitryahin;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		result();
	}

	public static String inputLine() {
		String st;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text:");
		st = sc.nextLine();
		return st;
	}

	public static void result() {
		String text = inputLine();
		String name = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of file:");
		name = sc.nextLine();

		saveFile(text, name);
	}

	public static void saveFile(String text, String name) {
		try (PrintWriter a = new PrintWriter(name)) {
			a.print(text);
			System.out.println("File successfully saved!");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}

}
