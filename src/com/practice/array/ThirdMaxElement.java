package com.practice.array;

import java.util.Arrays;

public class ThirdMaxElement {

	public static void main(String[] args) {

		int arr[] = {5,6,22,99,11};
		Arrays.sort(arr);
		int count = 0;
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				arr[count++] = arr[i];
				
			}
			
		}
		if(count < 3) {
			System.out.println(arr[count-1]);
		} else
		System.out.println(arr[count-3]);
	}

}
