package com.schoolofnet.javaapinative.main.java_lang_object;

import com.schoolofnet.javaapinative.main.public_code.PublicCode;

public class ObjectMain {
	public static void main(String[] args) {
		Object object = new Object();
		System.out.println(object.toString());
		
		String name = "Whenes";
		System.out.println(name.toString());
		
		PublicCode publicCode = new PublicCode();
		System.out.println(publicCode.toString());
			
		System.out.println("Object Class");
	}
}
