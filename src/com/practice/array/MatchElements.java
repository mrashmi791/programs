package com.practice.array;

import java.util.Scanner;

public class MatchElements {
	
	static void findMissing(int a[], int b[], int n, int m) {
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (a[i] == b[j]) {
					break;
				}
			}
			if (j == m)
				System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int arr2[] = new int[n];
		
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n;i++) {
			arr2[i] = sc.nextInt();
		}
		
		findMissing(arr,arr2,arr.length,arr2.length);
		

		
	}

}
