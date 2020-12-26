package com.practice.string;

import java.util.Scanner;

public class ReverseIndivuallyOfWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		String[] s = st.split(" ");
		for(int i = 0; i < s.length;i++) {
			String s1 = s[i];
			char[] str = s1.toCharArray();
			int n = str.length;
			char temp;
			for(int j = 0; j <n/2;j++) {
				temp = str[(n-1)-j];
				str[(n-1)-j] = str[j];
				str[j] = temp;
			}
				System.out.print(str);
			
		}
	}

}
