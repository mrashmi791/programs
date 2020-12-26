package com.practice.math;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(num > 0) {
			int d = num % 10;
			sum = sum + d*d*d;
			num = num / 10;
		}
		if(sum == temp) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number not armstrong");
		}
		sc.close();
	}

}
