package com.practice.leetcode;

import java.util.ArrayList;

public class ItsMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,7,8,2,4};
		int r = 0;
		int temp[] = new int[5];
//		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		int k = 0;
		boolean flag = false;
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr.length && i != j;j++) {
				sum = sum + j;
			}
			
			if(sum % 7 == 0) {
				temp[k] = arr[i];
//				System.out.print(k+ "k value " +temp[k]+" ");
				k++;
//				list.add(arr[i]);
			}
		}
//		System.out.println();
		for(int i = 0; i < temp.length && temp[i] !=0 ;i++) {
//			System.out.println( i + "value " +temp[i]);
			if(temp[i] > temp[i+1] ) {
				System.out.println(i+1);
				if(i +1 != 0) {
                    r =i+1;
               } else {
                   r = i;
               }
//				r = i;
				flag = true;
//				System.out.println(i);
			}
		}
		if(flag) {
			System.out.println(r);
		} else {
			System.out.println(-1);
		}
		

//		for(int i = 0; i < list.size() - 1;i++) {
//			if(list.get(i) > list.get(i+1)) {
//				r = list.get(i+1);
//			}
//		}
//		System.out.println(list);
//		System.out.println(r);
		
		

	}

}
