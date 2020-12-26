package com.prepration;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountNumberOfDuplicateWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		String[] array = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0 ; i < array.length;i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i])+1);
				
			} else {
				map.put(array[i], 1);
			}
		}
		 for (Map.Entry< String, Integer > entry : map.entrySet()) { 
			 if(entry.getValue() > 1) {
				 System.out.println(entry.getKey() + " " + entry.getValue());
			 }
//	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 

		sc.close();
		
	}

}
