package com.practice.array;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int arr2[][] = new int[n][n];
		int multiply[][] = new int[n][n];
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

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				for (int k = 0; k < n; k++) {

					multiply[i][j] = multiply[i][j] + arr[i][k] * arr2[k][j];

				}

			}

		}

		System.out.println("The product is:");

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				System.out.print(multiply[i][j] + " ");

			}

			System.out.println();

		}

	}

}
