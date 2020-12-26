package com.practice.string;

import java.util.Scanner;

public class RemoveGivenCharacter {
	static String result ="";
	public static String remove(String str, char ch) {
		for(int i = 0 ; i < str.length(); i++) {
			char temp  = str.charAt(i);
			if(temp == ch) {
				continue;
			}else {
				result= result+temp;
			}
		}
		return result;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string......");
		String str = sc.nextLine();
		System.out.println("Enter character to remove .....");
		char c = sc.next().charAt(0);
		 
		System.out.println(remove(str,c));
		
	}

}
