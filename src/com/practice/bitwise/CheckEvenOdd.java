package com.practice.bitwise;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int x = sc.nextInt();
		int res = x & 1;
		if(res == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
		
	}

}
