package com.practice.math;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");

		int str = sc.nextInt();
		int decimal = 0;
		int p = 0;
		while (str > 0) {
			int temp = str % 10;
			decimal = (int) (decimal + temp * Math.pow(2, p));
			str = str / 10;
			p++;
		}
		System.out.println(decimal);
		sc.close();
	}

}
