package com.practice.sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		 for (int i = 0; i < n-1; i++) { 
	            int index = i; 
	            for (int j = i+1; j < n; j++) 
	                if (arr[j] < arr[index]) 
	                    index = j; 
	            int temp = arr[index]; 
	            arr[index] = arr[i]; 
	            arr[i] = temp; 
	        } 

	}

}
