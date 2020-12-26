package com.practice.array;

import java.util.Scanner;

public class AddOneInAllElementAndSum {

	public static int sum(int arr[]) {
		int sum = 0;
		for(int x : arr) {
			sum = sum+x;
		}
		return sum+arr.length;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int len = sc.nextInt();
		int arr[] = new int[len];
		for (int i = 0 ; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		int result = sum(arr);
		System.out.println(result);
	}

}
