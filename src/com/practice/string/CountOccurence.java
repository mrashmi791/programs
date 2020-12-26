package com.practice.string;

import java.util.Scanner;

public class CountOccurence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String..!!!");
		String str = sc.nextLine();
		System.out.println("enter character ....");
		char c = sc.next().charAt(0);
		int count = 0;
		for(int i = 0 ; i < str.length(); i++) {
			char temp  = str.charAt(i);
			if(temp == c) {
				count++;
			}
		}
		System.out.println(count);
	}

}
