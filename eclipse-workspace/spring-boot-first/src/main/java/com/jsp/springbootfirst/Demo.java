package com.jsp.springbootfirst;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	@GetMapping("/test1")
	public String test() {
		return "hello";
	}

	@GetMapping("/test2")
	public Person test1() {
		Person person = new Person();
		person.setId(1);
		person.age = 20;
		person.name = "arun";
		return person;
	}

	@GetMapping("/test3")
	public List<Person> test2() {
		List<Person> list = new ArrayList<>();
		Person person = new Person();
		person.setId(1);
		person.setAge(23);
		person.setName("satyam");
		Person person1 = new Person();
		person1.setId(2);
		person1.setAge(33);
		person1.setName("vani");

		Person person11 = new Person();
		person11.setId(3);
		person11.setAge(23);
		person11.setName("sri");

		list.add(person);
		list.add(person1);
		list.add(person11);

		return list;

	}
    @PostMapping("/test4")
	public String test3(@RequestBody Person person) {

		System.out.println(person.getId() + " " + person.getAge() + " " + person.getName());
		return "data";

	}
    
    @PostMapping("/test6")
    public String test5(@RequestBody Mobile mobile) {
    	System.out.println(mobile.getId()+" "+mobile.getName()+" "+mobile.getSims());
		return "mobile data";
    }

}
