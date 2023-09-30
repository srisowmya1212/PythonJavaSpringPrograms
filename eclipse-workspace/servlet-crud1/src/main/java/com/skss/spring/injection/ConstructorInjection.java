package com.skss.spring.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Dondakay{
	void taste() {
		System.out.println("dondakay tates good");
		}
}
@Component
 class Curry {
	Dondakay dondi;

	public Curry(Dondakay d) {//give crtl space for constructor
		this.dondi=d;
	}
	

   public void dish() {
	dondi.taste();
  }
}

public class ConstructorInjection {

	public static void main(String[] args) {
		ApplicationContext c=new AnnotationConfigApplicationContext(AppConfig.class);
		Curry t=(Curry) c.getBean("curry");
		t.dish();
      
	}

 }

