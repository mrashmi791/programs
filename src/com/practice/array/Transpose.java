package com.practice.array;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n; j++ ) {
				arr[i][j] = sc.nextInt();
			}	
		}
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n; j++ ) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}

	}

}
