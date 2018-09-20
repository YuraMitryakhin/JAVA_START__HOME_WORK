package com.gmail.yuramitryahin;

public class Task5 {

	public static void main(String[] args) {
		int a=9;
		int b=5;
		int c=5;

		if(a+b>c && b+c>a && a+c>b){
			System.out.println("Triangle exists");
		} else{
			System.out.println("Triangle doesn't exist");
		}
	}

}
