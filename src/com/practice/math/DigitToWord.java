package com.practice.math;

import java.util.Scanner;

public class DigitToWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		for(int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case '0':
				System.out.print("Zero" + " ");
				break;
			case '1':
				System.out.print("One" + " ");
				break;
			case '2':
				System.out.print("Two" + " ");
				break;
			case 51:
				System.out.print("Three" + " ");
				break;
			case 52:
				System.out.print("Four" + " ");
				break;
			case 53:
				System.out.print("Five" + " ");
				break;
			case 54:
				System.out.print("Six" + " ");
				break;
			case 55:
				System.out.print("Seven" + " ");
				break;
			case 56:
				System.out.print("Eight" + " ");
				break;
			case 57:
				System.out.print("Nine" + " ");
				break;
			}

		}
		sc.close();
	}

}
