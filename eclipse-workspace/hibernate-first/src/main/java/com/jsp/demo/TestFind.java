package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestFind {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager=emf.createEntityManager();
		User user=entityManager.find(User.class,1 );
		if(user!=null) {
			System.out.println("user id: "+user.getId());
			System.out.println("user name: "+user.getName());
			System.out.println("user age: "+user.getAge());
		}
		else {
			System.out.println("plz check the id");
		}

	}

}
