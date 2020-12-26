package com.practice.array;

import java.util.Scanner;

public class FindLargestAndSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int len = sc.nextInt();
		int arr[] = new int[len];
		for (int i = 0 ; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < len-1; i++) {
			for(int j = i; j < len; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Largest no : "+ arr[len-1]+" Smallest no : " +arr[0]);

	}

}
