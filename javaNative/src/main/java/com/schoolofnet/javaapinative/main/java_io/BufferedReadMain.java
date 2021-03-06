package com.schoolofnet.javaapinative.main.java_io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReadMain {
	public static void main(String[] args) {
		BufferedReader br;
		
		try {
			String currentLine;
			br = new BufferedReader(new FileReader("test.txt"));
			
			while((currentLine = br.readLine()) != null) {
				System.out.println(currentLine);
			}
			
			if (br != null) {
				br.close();				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
