package com.practice.math;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start value ");
		int num = sc.nextInt();
		System.out.println("Enter end value ");
		int num1 = sc.nextInt();
		int sum = 0;
		for(int i = num; i <= num1;i++) {
			sum = sum+i;
		}
		System.out.println(sum/(num1 - num + 1));


		sc.close();
	}

}
