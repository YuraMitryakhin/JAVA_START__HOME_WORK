package com.gmail.yuramitryahin;

public class Task5 {

	public static void main(String[] args) {
		String st;
		st = ("London is the capital of Great Britain");
		System.out.println(wordsNumber(st));
	}

	public static int wordsNumber(String s) {
		int k = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				k++;
			}
		}
		return k;
	}

}
