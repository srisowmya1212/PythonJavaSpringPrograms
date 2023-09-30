package com.skss.spring.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kitchen {
  Cook cook;

public Cook getCook() {
	return cook;
}
@Autowired //setter injection method which is used to get the address of an object
public void setCook(Cook cook) {
	this.cook = cook;
}
public void dining() {
	cook.dish();
}

  
}
