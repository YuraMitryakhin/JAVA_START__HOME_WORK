package com.gmail.yuramitryahin;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   int ax=0;
	   int ay=0;
	   int bx=4;
	   int by=4;
	   int cx=6;
	   int cy=1;
	   int dx;
	   int dy;
	   int a;
	   int b;
	   int c;
	   
	   System.out.print("Enter x coordinate: ");
       dx=sc.nextInt();
       System.out.print("Enter y coordinate: ");
       dy=sc.nextInt();
       
       a=(ax-dx)*(by-ay)-(bx-ax)*(ay-dy);
       b=(bx-dx)*(cy-by)-(cx-bx)*(by-dy);
       c=(cx-dx)*(ay-cy)-(ax-cx)*(cy-dy);
       
       if((a>=0&&b>=0&&c>=0)||(a<=0&&b<=0&&c<=0)){
    	   System.out.println("Point belongs to the triangle!");
       }else{
    	   System.out.println("Point doesn't belongs to the triangle!");
       }
	}

}
