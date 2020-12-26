package com.practice.array;

import java.util.Scanner;

public class FindDuplicate {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[100];
		
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < n;i++) {
			int x= arr[i];
			for(int j = i+1;j<n;j++) {
				if((arr[j] == x) && (j != i)) {
					System.out.println("duplicate number is "+ x);
					
				}
			}
			
		}
		
	}

}
