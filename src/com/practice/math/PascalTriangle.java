package com.practice.math;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int r = sc.nextInt();
		System.out.println(" pyramid triangle ");
		for(int i = 0; i <r;i++) {
			for(int j = r-i;j >1; j--) {
				System.out.print(" ");
			}
			for(int j = 0;j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(" pyramid triangle 2");
		for(int i = 0; i <r;i++) {
			for(int j = 0;j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(" pyramid triangle 3");
		for(int i = 0; i <r;i++) {
			for(int j = 2*(r-i);j >=0; j--) {
				System.out.print(" ");
			}
			for(int j = 0;j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
