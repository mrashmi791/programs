package com.practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word ");
		String str = sc.nextLine();
		String str2= "";
		int l = str.length();
		for(int i = l-1; i >=0; i--) {
			
			str2  = str2+str.charAt(i);
	
		}
		System.out.println(str2);
		sc.close();
	}

}
