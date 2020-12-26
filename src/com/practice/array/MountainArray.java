package com.practice.array;

/*
 * 
 * Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]

 * 
 * 
 */

public class MountainArray {

	public static void main(String[] args) {

		int arr[] = {2,1};
		int  flag = 0;
		
			if(arr.length >= 3) {
				for(int i = 1 ; i < arr.length-1;i++) {
					if(arr[0] > arr[1] && arr[i] == arr[i+1]) {
						System.out.println("false");
						flag = 1;
						return;
					} 
					if(arr[i] > arr[i+1] && arr[i] != arr[i+1]) {
						for(int j = i+1; j < arr.length-1; j++) {
							if(arr[j] <= arr[j+1]) {
								System.out.println("false");
								flag = 1;
								return;
							}
						}
						
					}
				}
			}
//			if(flag == 0) {
//				System.out.println("true");
//			}
			
		
	}

}
