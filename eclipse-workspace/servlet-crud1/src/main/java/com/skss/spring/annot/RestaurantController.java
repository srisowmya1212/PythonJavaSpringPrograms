package com.skss.spring.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestaurantController {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("annot-spring.xml");
		RahulPotta p=(RahulPotta) context.getBean("rahulPotta");
		p.eat();
		MyBike b=(MyBike) context.getBean("myBike");
		b.ride();
		

	}

}
