package com.gmail.yuramitryahin;

public class Task3 {

	public static void main(String[] args) {
		int h = 4;
		int w = 5;
		printRectangle(h, w);
	}

	public static void printRectangle(int h, int w) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

}
