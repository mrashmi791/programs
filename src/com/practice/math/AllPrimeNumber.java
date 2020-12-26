package com.practice.math;

import java.util.Scanner;

public class AllPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter start value");
		int start = sc.nextInt();
		System.out.println("Enter last value");
		int last = sc.nextInt();
		int counter = 0;
		String primeNumbers = ""; 
		for(int i = start; i <= last; i++) {
			counter = 0;
			for(int num = i; num >= 1; num--) {
				if(i % num == 0 ) {
					counter += 1;
				}
			}
			if(counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println(primeNumbers);
	}

}
