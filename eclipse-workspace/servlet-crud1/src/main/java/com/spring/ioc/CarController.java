package com.spring.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CarController {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("myspring.xml");
		BeanFactory b=new XmlBeanFactory(r);
		
		Car c=(Car) b.getBean("BMW");
		c.travel();

	}

}
