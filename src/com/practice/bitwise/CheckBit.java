package com.practice.bitwise;

import java.util.Scanner;

public class CheckBit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int count = 0;
		
	
		
		while(n1 > 0) {
			count += n1 & 1;
			n1 >>= 1;
		}
		
//		 while(n1  > 0) {
//			 if(n1 %2 == 1) {
//				 count++;
//			 }
//			 n1 = n1/2;
//		 }
		 System.out.println(count);
	}

}
