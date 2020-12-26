package com.practice.array;

import java.util.Scanner;

public class SubstractionOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		int arr2[][] = new int[n][n];
		
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n; j++ ) {
				arr[i][j] = sc.nextInt();
			}	
		}

		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n; j++ ) {
				arr2[i][j] = sc.nextInt();
			}	
		}
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n; j++ ) {
				arr[i][j] = arr[i][j]-arr2[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
