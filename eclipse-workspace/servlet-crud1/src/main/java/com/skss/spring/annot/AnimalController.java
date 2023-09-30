package com.skss.spring.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.skss.spring.annot.configuration.AppConfiguration;

@Component

class Chimpazee{
	void jump() {
		System.out.println("chimpu is  a stunt man");
	}
}

public class AnimalController {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
		System.out.println(context.getBean("chimpazee"));
		Chimpazee c=(Chimpazee) context.getBean("chimpazee");
		c.jump();
		
		

	}

}
