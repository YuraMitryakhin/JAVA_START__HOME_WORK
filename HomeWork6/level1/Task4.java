package com.gmail.yuramitryahin;

import java.util.Formatter;

public class Task4 {

	public static void main(String[] args) {
		result();
	}

	public static void result() {
		for (int i = 0; i < 10; i++) {
			Formatter form = new Formatter();
			form.format("%." + (i + 2) + "f", Math.PI);
			System.out.println(form);
		}
	}

}
