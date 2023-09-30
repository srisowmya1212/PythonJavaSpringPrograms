package com.skss.spring.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.skss.spring.annot.configuration.AppConfiguration;

public class RingMasterController {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
		Lion l=(Lion) context.getBean("lion");
		l.hunt();
		Donkey d1=(Donkey) context.getBean("donkey");
		d1.load();
        Donkey d=new Donkey();
        d.load();
	}
	

}
