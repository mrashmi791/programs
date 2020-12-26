package com.practice.math;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		String str = sc.nextLine();
		while(num > 0) {
			int d = num % 2;
			str =  d+ str;
			num = num /2;
		}
		System.out.println(str);
		sc.close();
	}

}
