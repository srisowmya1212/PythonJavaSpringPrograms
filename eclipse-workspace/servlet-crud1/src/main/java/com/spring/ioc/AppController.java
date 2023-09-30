package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppController {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("myspring.xml");
		Emp e=(Emp) context.getBean("poshaih");
		System.out.println(e);

	}

}
