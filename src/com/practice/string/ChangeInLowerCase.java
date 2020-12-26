package com.practice.string;

public class ChangeInLowerCase {

	public static String change(String str) {
		String s ="";
		char[] array = str.toCharArray();
		for(int i = 0; i < array.length;i++) {
			if(array[i] >=65 && array[i] <=90) {
				array[i] = (char) (array[i]+32);
				s = s+ array[i];
			} else {
				s = s+array[i];
			}
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("ello");
		String res = change(s);
		System.out.println(res);
	}

}
