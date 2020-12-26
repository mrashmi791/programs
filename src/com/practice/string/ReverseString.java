package com.practice.string;

import java.util.Scanner;

public class ReverseString {
	
	private static char[] rev(char arr[], int low,int high) {
		if (low > high) {
			return arr;
			
		}
		char temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
		
		low++;
		high--;
		
		return rev(arr,low,high);
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int high = str.length()-1;
		char[] arr = str.toCharArray();;
		
		
		char[] rev2 = rev(arr,0,high);
		String reverse = String.valueOf(rev2);
		
		System.out.println(reverse);
		
		
		
		
		
		
		 
//		String str2="";
//		for(int i = str.length()-1; i >=0; i--) {
//			str2= str2+str.charAt(i);
//		}
//		System.out.println(str2);
		
	
		
		
		
		
		
		
		
//		char[] arr = str.toCharArray();
//
//		char temp;
//		for (int i = 0; i <= n / 2; i++) {
//			temp = arr[(n - 1) - i];
//			arr[(n - 1) - i] = arr[i];
//			arr[i] = temp;
//		}
//		for (Character ch : arr) {
//			System.out.print(ch);
//		}
		
		 
	}

}
