package com.practice.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MatrixMultiply {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first matrix : ");
		int n = sc.nextInt();
		int arr[][] = new int [n][n];
		
		
		int arr2[][] = new int [n][n];
		
		int sum[][] = new int [n][n];
		System.out.println("Enter first matrix element : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter second matrix element : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++)  {
			for (int j = 0; i < n; j++) {
				for (int k = 0; k < n; k++)  {
					sum[i][j] = sum[i][j] + arr[i][k] * arr2[k][j];
				}
			}
			
		}
		System.out.println("The product is:");

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				System.out.print(sum[i][j] + " ");

			}

			System.out.println();

		}

	}

}
