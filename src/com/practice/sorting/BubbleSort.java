package com.practice.sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void optimizeSort(int arr[] , int n) {
		
		boolean isSorted = true;
		
		for(int i = 0;i < n-1 && (isSorted = true);i++) {
			isSorted = false;
			for(int j = 1;j < n-i;j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					isSorted = true;
				}
			}
			if(!isSorted) 
				break;
			
			
		}
		
	}

	public static void recursiveSort(int arr[], int n) {
		if(n == 0) {
			return;
		}
		for(int j = 0;j<n-1;j++) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
			}
			
		}
		recursiveSort(arr, n-1);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

//		for (int j = 0; j < n - 1; j++) {
//			if (arr[j] > arr[j + 1]) {
//
//				int temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}

//		recursiveSort(arr, arr.length);
		optimizeSort(arr,arr.length);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
