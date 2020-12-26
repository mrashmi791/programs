package com.practice.math;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find cube");
		int num = sc.nextInt();
		System.out.println(num * num * num);
		
		System.out.println("Enter radius to find area of circle");
		int r = sc.nextInt();
		double pi = 3.14;
		System.out.println(pi * r * r);
		
		System.out.println("Enter height of triangle");
		int h = sc.nextInt();
		System.out.println("Enter breadth of triangle");
		int b = sc.nextInt();
		System.out.println((h*b)/2);
		
		System.out.println("Enter numbet to find square root");
		int s = sc.nextInt();
		int res = square(s);
		System.out.println(res);
		sc.close();
	}
	
	public static int square(int x) {
		if(x == 0 && x == 1) {
			return x;
		}
		int i = 1;
		int res = 1;
		while (res <= x) {
			i++;
			res = i * i;
		}
		return i-1;
	}

}
