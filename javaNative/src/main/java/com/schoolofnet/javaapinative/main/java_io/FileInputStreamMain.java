package com.schoolofnet.javaapinative.main.java_io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamMain {
	public static void main(String[] args) {
		FileInputStream fis;
		BufferedInputStream bis;
		
		try {
			fis = new FileInputStream(new File("test.txt"));
			bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			while (dis.available() != 0) {
				System.out.println(dis.readLine());
			}
			dis.close();
			bis.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
