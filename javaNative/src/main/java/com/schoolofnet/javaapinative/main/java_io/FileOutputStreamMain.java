package com.schoolofnet.javaapinative.main.java_io;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		File file;
		FileOutputStream fop;
		try {
			file = new File("test.txt");
			
			if (file.createNewFile()) {
				System.out.println("File has created");
			} else {
				System.out.println("File alredy exists");
			}
			
			fop = new FileOutputStream(file);
			
			if (!file.exists()) {
				file.createNewFile();
			}
			String text = "Testing write in file with OutputStream";
			fop.write(text.getBytes());
			fop.flush();
			fop.close();
			System.out.println("Done!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
