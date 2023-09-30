package com.jsp.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionStoreException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestCoreContainer {

	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		Demo demo=(Demo) beanFactory.getBean("demo1");
		demo.test();
	}

}
