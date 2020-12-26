package com.practice.array;

import java.util.Scanner;

public class FindTopValueAndSmallValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i < n-1;i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		System.out.println("top two elements is : "+arr[n]+ " , "+arr[n-1]);
		System.out.println("Largest number : "+ arr[n]);
		System.out.println("Smallest number : "+arr[0]);
	}

}
