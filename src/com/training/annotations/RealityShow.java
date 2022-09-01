package com.training.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Event(spaceTypeNeeded = " studio ",successful = true)
//@Performer by the virtue of being sub class of Circus is annotated as Performer
public class RealityShow extends Circus{
	
	@DataField private int id;
	@DataField private String name;
	
	
	
	@MyAnnotation  void m1() {}
	@MyAnnotation void m2() {}
	void m3() {}
	
	public static void main(String[] args) {
		
		Class obj = RealityShow.class;
		Annotation []a=obj.getAnnotations();
		
		for(Annotation an:a) {
			System.out.println(an.getClass());
		}
		
		Method []arr = obj.getDeclaredMethods();
		for (Method m:arr) {
			
		Annotation[] methodLevelAnnotations =	m.getAnnotations();
			for(Annotation m1:methodLevelAnnotations) {
				
				System.out.println(m1.toString().getBytes());
				System.out.println(m1.annotationType());
			}
		}
		
		
		Field[] fields = 	obj.getDeclaredFields();
		for(Field f:fields) {
			
			Annotation [] fArr = f.getAnnotations();
			
			for(Annotation af: fArr) {
				
				System.out.println(af.annotationType());
			}
			
		}
	}
	
	

}
