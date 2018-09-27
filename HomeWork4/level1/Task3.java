package com.gmail.yuramitryahin;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		int[] mas1 = new int[15];
		int[] mas2 = new int[30];

		for (int i = 0; i < mas1.length; i++) {
			mas1[i]=(int)(Math.random()*10);
			mas2[i]=mas1[i];
			mas2[i+15]=mas1[i]*2;
		}
		
		System.out.println(Arrays.toString(mas1));
		System.out.println(Arrays.toString(mas2));

	}

}
