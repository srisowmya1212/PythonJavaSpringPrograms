package com.skss.spring.annot;

import org.springframework.stereotype.Component;

@Component
public class Donkey {
	public void load() {
		System.out.println("donkey carries weight");
	}

}
