package com.schoolofnet.javaapinative.main.private_code;

public class PrivateCode {
	private String name;
	public PrivateCode() {
		name = "Private Class Name";
		System.out.println("Private Class");
		print();
	}
	
	private void print() {
		System.out.println(name);
	}
}
