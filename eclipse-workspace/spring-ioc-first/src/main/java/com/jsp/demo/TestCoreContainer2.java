package com.jsp.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestCoreContainer2 {

	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		Demo1 demo1=(Demo1) beanFactory.getBean("demo2");
		demo1.test();

	}

}
