package com.skss.spring.annot;

import org.springframework.stereotype.Component;

@Component
public class Cook {
    void dish() {
    	System.out.println("cook prepares a dish");
    }

}
