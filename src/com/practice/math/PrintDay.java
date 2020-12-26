package com.practice.math;

import java.util.Scanner;

public class PrintDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in dd-mm-yy format ");
		String s = sc.nextLine();
		String s1[] = s.split("-");
		int y = Integer.parseInt(s1[2]);
		int m = Integer.parseInt(s1[1]);
		int d = Integer.parseInt(s1[0]);
		int sum = 0;
	
		for (int i = 1; i < m; i++) {
			if (i == 1 || i == 3 | i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				sum = sum + 31;
			} else if (i == 2) {
				sum = sum + 29;
			} else {
				sum = sum + 30;
			}
			System.out.println(sum);
		}
		sum = sum + d;
		
		int n = sum % 7;
		
		switch (n) {
		case 5:
			System.out.print("Sunday" + " ");
			break;
		case 6:
			System.out.print("Monday" + " ");
			break;
		case 0:
			System.out.print("Tuesday" + " ");
			break;
		case 1:
			System.out.print("Wednesday" + " ");
			break;
		case 2:
			System.out.print("Thursday" + " ");
			break;
		case 3:
			System.out.print("Friday" + " ");
			break;
		case 4:
			System.out.print("Saturday" + " ");
			break;

		}
	}
}
