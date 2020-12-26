package com.practice.sorting;

import java.util.Scanner;

public class QuickSort {
	
	public static void quickSort(int arr[], int start,int end) {
		int k;
//		System.out.println("k"+k);
		if(start < end) {
			k = partition(arr,start,end);
			System.out.println("k"+k);
			quickSort(arr,start,k-1);
			quickSort(arr,k+1,end);
		}
	}
	
	public static int partition(int arr[], int start,int end) {
		int pivot = arr[end];
		int m = start - 1;
		System.out.println("m "+m);
		for(int j = start;j < end; j++) {
			if(arr[j] < pivot) {
				m++;
				
                int temp = arr[m]; 
                arr[m] = arr[j]; 
                arr[j] = temp; 
			}
		}
		int temp = arr[m+1]; 
        arr[m+1] = arr[end]; 
        arr[end] = temp; 
        System.out.println("return"+(m+1));
        return m+1; 
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter matrix element : ");
		for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
		quickSort(arr,0,n-1);
		 for(int x = 0; x < n; x++)  {
		        System.out.print(arr[x]+" ");  
		    }  
	}

}
