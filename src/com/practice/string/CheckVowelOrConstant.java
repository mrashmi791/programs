package com.practice.string;

import java.util.Scanner;

public class CheckVowelOrConstant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		char ch = sc.nextLine().charAt(0);
		if((ch == 'a' || ch == 'e'|| ch == 'i'||ch == 'o'||ch == 'u' )||
				(ch == 'A' || ch == 'E'|| ch == 'I'||ch == 'O'||ch == 'U')) {
			System.out.println("Given character is Vowel");
		} else {
			System.out.println("Given character is Constant");
		}
		sc.close();
	}

}
