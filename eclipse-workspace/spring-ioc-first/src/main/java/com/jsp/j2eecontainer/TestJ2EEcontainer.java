package com.jsp.j2eecontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJ2EEcontainer {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring1.xml");
		Demo1 demo1=(Demo1) applicationContext.getBean("j2ee1");
		demo1.test();
	}

}
