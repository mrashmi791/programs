package com.practice.math;

import java.util.Scanner;

public class NumberInWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		int rev = 0;
		int zeroCount = 0;
		boolean isLastZero = false;
		
		while (num > 0) {
			int d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
			
			if(d == 0 && !isLastZero) {
				zeroCount = zeroCount + 1;
			} else {
				isLastZero = true;
			}
		}

		while (rev > 0) {
			int n = rev % 10;
			rev = rev / 10;
			switch (n) {
			case 0:
				System.out.print("Zero" + " ");
				break;
			case 1:
				System.out.print("One" + " ");
				break;
			case 2:
				System.out.print("Two" + " ");
				break;
			case 3:
				System.out.print("Three" + " ");
				break;
			case 4:
				System.out.print("Four" + " ");
				break;
			case 5:
				System.out.print("Five" + " ");
				break;
			case 6:
				System.out.print("Six" + " ");
				break;
			case 7:
				System.out.print("Seven" + " ");
				break;
			case 8:
				System.out.print("Eight" + " ");
				break;
			case 9:
				System.out.print("Nine" + " ");
				break;
			}

		}

		for(int i =  0; i < zeroCount;  i++) {
			System.out.print("Zero ");
		}
		sc.close();

	}

}
