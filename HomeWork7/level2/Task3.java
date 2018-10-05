package com.gmail.yuramitryahin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task3 {
	public static void main(String[] args) {
		File file;
		printPattern(new File("pattern.txt"));
	}

	public static void printPattern(File file) {
		try (PrintWriter wr = new PrintWriter(file)) {
			for (int i = 0; i < 40; i++) {
				for (int j = 0; j < 5; j++) {
					wr.print("**");
					wr.print("--");
					wr.print("##");
					wr.print("--");
				}
				wr.println("");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}

}
