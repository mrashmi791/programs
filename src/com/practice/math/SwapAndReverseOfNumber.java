package com.practice.math;

import java.util.Scanner;

public class SwapAndReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for swapping");
		
		System.out.println("Enter 2 for reverse");
		int key = sc.nextInt();
		switch(key) {
		case 1:
			System.out.println("Enter 1st number");
			int num = sc.nextInt();
			System.out.println("Enter 2nd number");
			int num2 = sc.nextInt();
			swap1(num,num2);
			break;
		case 2:
			System.out.println("Enter 1st number");
			int num1 = sc.nextInt();
			
			reverse(num1);
			break;
		}
		sc.close();
	}
	public static void swap(int a , int b) {
		int temp = a; 
		a = b;
		b = temp;
		System.out.println("1st Number is : " +a +" 2nd Number is : " +b);
	}
	public static void swap1(int a , int b) {
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("1st Number is : " +a +" "+"2nd Number is : " +b);
	}
	
	public static void reverse(int a) {
		int rev = 0;
		while(a > 0) {
			int d = a%10;
			rev = rev * 10+d;
			a = a/ 10;
		}
		System.out.println("Reverse Number is : " +rev);
	}
	


}
