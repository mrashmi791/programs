package com.practice.array;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i = 0; i < size;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = size-1; i >= 0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
