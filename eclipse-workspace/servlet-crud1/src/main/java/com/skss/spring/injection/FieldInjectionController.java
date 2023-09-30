package com.skss.spring.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class SmallFish{
	void eat() {
		System.out.println("eat small worms");
	}
	
}
@Component
class Aquarium{
	@Autowired
	SmallFish fish;
	public void scenary() {
		fish.eat();
	}
}
public class FieldInjectionController {

	public static void main(String[] args) {
		ApplicationContext c=new AnnotationConfigApplicationContext(AppConfig.class);
		Aquarium a=(Aquarium) c.getBean("aquarium");
		a.scenary();
	}

}
