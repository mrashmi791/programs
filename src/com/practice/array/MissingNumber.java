package com.practice.array;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[100];
		
		for(int i = 0; i < n-1;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
		         sum += arr[i];
		}

		int total = (n + 1) * n / 2;

		System.out.println("missing number is: " + (total - sum) );
	}

}
