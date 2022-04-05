package com.schoolofnet.javaapinative.main.java_lang_wrappers;

public class WrappersMain {
	public static void main(String[] args) {
		//primitive types
		//boolean, int, char, float, double, long
		
		//wrapper types
		//Boolean, Integer, Character, Float, Double, Long, String
		
		//não herda de object
		int number1 = 0;
//		number1. //não possui métodos
		
		//herda de object
		Integer number2 = 2;
		System.out.println(number2.intValue());
		
		int number3 = number2;
		System.out.println(number3);
		
		Integer number4 = new Integer(4);//instanciação com construtor
		System.out.println(number4);
	}
}
