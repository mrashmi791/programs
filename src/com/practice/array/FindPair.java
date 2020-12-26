package com.practice.array;

import java.util.Scanner;

public class FindPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter pair value : ");
		int value = sc.nextInt();
		for(int i = 0;i < n-1;i++) {
			int x = arr[i]+arr[i+1];
			if(x == value) {
				System.out.println("( "+arr[i]+", "+ arr[i+1]+" )");
			}
		}
	}

}
