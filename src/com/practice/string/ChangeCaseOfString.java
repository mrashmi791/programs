package com.practice.string;

import java.util.Scanner;

public class ChangeCaseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word ");
		String str = sc.nextLine();
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) >='A' && str.charAt(i) < 'Z') {
				str = str.toLowerCase();
			} else if(str.charAt(i) >='a' && str.charAt(i) < 'z') {
				str = str.toUpperCase();
			}
			
		}
		System.out.println(str);
		
		

	}

}
