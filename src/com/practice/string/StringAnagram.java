package com.practice.string;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.nextLine();
		System.out.println("Enter second string");
		String s2 = sc.nextLine();
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();

		if (s1.length() != s2.length())
			System.out.println("not anagram");
		else
		{
			for (int i = 0; i < s1.length(); i++)
			{
				for (int j = 0; j < s2.length(); j++)
				{
					if (s1.charAt(i) == s2.charAt(j))
					{
						s2 = s2.substring(0, j) + s2.substring(j + 1);
//						System.out.println("substing "+s2);
						break;
					}
				}
			}

			if (s2.length() == 0)
			{
				System.out.println(" anagram");
			} else
			{
				System.out.println("not anagram");
			}
		}
	}
		
	}


