package com.practice.math;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while(num > 0) {
			int d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}
		if(rev == temp) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number not palindrome");
		}
		sc.close();
	}

}
