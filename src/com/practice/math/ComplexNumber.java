package com.practice.math;

import java.util.Scanner;

public class ComplexNumber {
	double real,imag;
	

	public ComplexNumber(double real, double imag) {
		
		this.real = real;
		this.imag = imag;
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first complex number");
		double number = sc.nextDouble();
		System.out.println("Enter first complex number");
		double number2 = sc.nextDouble();
		
		ComplexNumber c = new ComplexNumber(number,number2);
		
//		String[] n1 = number.split("[+]");
//		String[] n2 = number2.split("[+]");
//		
//		int a = Integer.parseInt(n1[0]);
//		int b = Integer.parseInt(n1[1]);
//		int x = Integer.parseInt(n2[0]);
//		int y = Integer.parseInt(n2[1]);
		
//		int sum =a+x;
//		int s = b+y;
//		System.out.println(sum +"+"+s);
	}

}
