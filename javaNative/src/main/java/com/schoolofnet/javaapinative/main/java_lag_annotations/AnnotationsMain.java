package com.schoolofnet.javaapinative.main.java_lag_annotations;

import java.lang.annotation.Annotation;

//@Info(createdBy = "Will")
public class AnnotationsMain {
	public static void main(String[] args) {
		
		//uso de reflection para comportamentos baseados nas annotations
		Class<AnnotationExample> obj = AnnotationExample.class;
		
		if (obj.isAnnotationPresent(Info.class)) {
			Annotation annotation = obj.getAnnotation(Info.class);
			Info info = (Info) annotation;
			System.out.println(info.createdBy());
		}
	}
}
