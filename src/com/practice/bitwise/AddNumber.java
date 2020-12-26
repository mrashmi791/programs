package com.practice.bitwise;

import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		while(n2 != 0) {
			int carry = n1 & n2;
			n1 = n1 ^ n2;
			n2 = carry << 1;
		}
		System.out.println(n1);
	}

}
