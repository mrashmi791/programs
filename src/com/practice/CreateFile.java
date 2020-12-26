package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean status = false;
		System.out.println("Enter path of directory ");
		String d = s.nextLine();
		File dir  = new File(d);
		if(dir.exists()) {
			System.out.println("Directory already exits"+dir);
		} else {
			status = dir.mkdir();
			if(status) {
				System.out.println("Successfully created ");
			} else {
				System.out.println("fail to create ");
			}
		}
		System.out.println("Enter file name ");
		String f = s.nextLine();
		File file = new File(dir +"/"+ f + ".txt");
		if(file.exists()) {
			System.out.println("file already exits");
		} else {
			status = file.createNewFile();
			if(status) {
				System.out.println("Successfully created ");
			} else {
				System.out.println("fail to create ");
			}
		}
		
		
		
	}

}
