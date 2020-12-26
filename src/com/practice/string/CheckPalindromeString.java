package com.practice.string;

import java.util.Scanner;

public class CheckPalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word ");
		String str = sc.nextLine();
		String s = str;
		String str2= "";
		int l = str.length();
		for(int i = l-1; i >=0; i--) {
			
			str2  = str2+str.charAt(i);
	
		}
		if(str2.equals(s)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		sc.close();
	}

}
