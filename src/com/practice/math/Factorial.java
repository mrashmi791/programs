package com.practice.math;

import java.util.Scanner;

public class Factorial {

	public static int factorial (int n) {
		if(n == 1) {
			return n;
		}
		return n*factorial(n-1);
	}
	
	public static int sum (int n) {
		if(n == 1) {
			return n;
		}
		return n+sum(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int fact = 1;
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum = sum +i;
			fact = fact * i;
		}
		System.out.println("Sum of n number is : "+ sum);
		System.out.println("Factorial is : "+ fact);
		int k = factorial(num);
		System.out.println("factorial using recursion : "+k);
		int m = sum(num);
		System.out.println("sum using recursion : "+m);
		sc.close();

	}

}
