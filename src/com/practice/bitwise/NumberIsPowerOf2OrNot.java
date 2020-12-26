package com.practice.bitwise;

import java.util.Scanner;

public class NumberIsPowerOf2OrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		if((n1 & (n1-1)) ==0) {
			System.out.println("power of 2");
		} else {
			System.out.println("not power of 2");
		}
	}

}
