package com.practice.array;

import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i = 0; i < size;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int i = 1; i < size;i++) {
			
			if( max < arr[i] ) {
				
				max = arr[i];
				
			}
		}
		System.out.println(max);

	}

}
