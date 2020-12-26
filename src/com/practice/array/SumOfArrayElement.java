package com.practice.array;

import java.util.Scanner;

public class SumOfArrayElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		
		int sum = 0;
		int avg = 0;
		
		System.out.println("Enter  matrix element : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				sum = sum + arr[i][j];
			}
		}
				System.out.println("Sum : " +sum);
				avg = sum/(n*n);
				System.out.println("Average : "+avg);
	}

}
