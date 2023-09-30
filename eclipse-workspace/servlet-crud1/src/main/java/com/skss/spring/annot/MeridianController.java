package com.skss.spring.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.skss.spring.annot.configuration.AppConfiguration;

public class MeridianController {

	public static void main(String[] args) {
		ApplicationContext c=new AnnotationConfigApplicationContext(AppConfig2.class);
		Kitchen k=(Kitchen) c.getBean("kitchen");
		k.dining();
		
	}

}
