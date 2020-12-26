package com.practice.dailypro;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {

		String str = new String("banana");
		int n = str.length();
		int max = 0;
		int start = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				boolean isSorted = checkPalindrome(str,i,j);
				if(isSorted && max < j-i) {
					max = j-i+1;
					start = i;
				}
				
			}
		}
		System.out.println(str.substring(start, start+max));
	}

	private static boolean checkPalindrome(String str, int i, int j) {
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
