package com.practice.bitwise;

/**
 * 
 * @author Mrityunjay
 *
 */
public class SwapTwoNumberWwithoutUsingThirdVariable {

	public static void swapNumberWithoutUsingThirdvariable(int num, int num2) {
		num = num + num2;
		num2 = num - num2;
		num = num - num2;
		System.out.println("Num and Num2: " + num + " :: " + num2);
	}
	
	public static void swapNumberUsingBitWise(int num, int num2) {
		num = num ^ num2;
		num2 = num ^ num2;
		num = num ^ num2;
		
		System.out.println("Num and Num2: " + num + " :: " + num2);
	}

	public static void main(String[] args) {
		swapNumberWithoutUsingThirdvariable(12, 56);
		swapNumberUsingBitWise(11, 34);
		
//		00111
		int x = 036;
		x = x >>> 2;
		System.out.println("ans: "+ x);
	}

}
