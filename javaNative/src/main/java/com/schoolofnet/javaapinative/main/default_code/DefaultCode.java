package com.schoolofnet.javaapinative.main.default_code;

public class DefaultCode {//Modificador default é valido para classes, atributos e métodos.
	Integer age;
	DefaultCode() {
		this.age = 32;
		System.out.println("Default Class Age: " + this.age);
	}
	public DefaultCode(Integer age) {
		this.age = age;
		System.out.println("Default Class Age: " + this.age);
	}
}
