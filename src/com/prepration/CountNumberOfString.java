package com.prepration;

import java.util.Scanner;

public class CountNumberOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		String[] array = str.split(" ");
		System.out.println(array.length);
	}

}
