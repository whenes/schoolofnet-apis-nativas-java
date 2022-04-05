package com.schoolofnet.javaapinative.main.java_io;

import java.io.File;

public class FileMain {
	public static void main(String[] args) {
		try {
			File file = new File("test.txt");	
			if (file.createNewFile()) {
				System.out.println("File has created");
			} else {
				System.out.println("File already exists");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
