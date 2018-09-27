package com.gmil.yuramitryahin;

public class Task2 {

	public static void main(String[] args) {

		System.out.print(findMax());

	}

	public static int findMax() {
		int a = 100;
		int b = 100;
		int multp;
		int max;
		int maxValue=0;
		int aMax = 0;
		int bMax=0;;

		for (int i = 1; i < 900; i++) {
			a=100;
			for (int j = 1; j < 900; j++) {
			   multp=a*b;
			   max = findPld(multp);
               if(maxValue<max){
            	   maxValue=max;
            	   aMax=a;
            	   bMax=b;
               }
               a++;
			}
			b++;
		}
		printAB(aMax,bMax);
		return maxValue;
	}
	
	public static int findPld(int value){
		int max = 0;
		if(value/10e5==0){
        	int n1 = value / 10000;
       		int n2 = value % 10000 / 1000;
       		int n3 = value % 1000 / 100;
       		int n4 = value % 100/10;
       		int n5 = value % 10;
        	   if(n1==n5&&n2==n4){
        		   max=value;
        	   }
           }else{
        	   int n1 = value / 100000;
          		int n2 = value % 100000 / 10000;
          		int n3 = value % 10000 / 1000;
          		int n4 = value % 1000/100;
          		int n5 = value % 100/10;
           		int n6 = value % 10;
           	   if(n1==n6&&n2==n5&&n3==n4){
           		   max=value;
           	   }
           }
		return max;
	}
	
	public static void printAB (int a, int b){
		System.out.print(a+"*"+b+"=");
	}
}
