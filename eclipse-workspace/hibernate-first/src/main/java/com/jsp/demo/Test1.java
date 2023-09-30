package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test1 {

	public static void main(String[] args) {
		User user=new User();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		user.setId(5);
		user.setAge(32);
		user.setName("vani");
		user.setPhonenum(6467843562l); 
		et.begin();
		entityManager.persist(user);
		et.commit();
		System.out.println("data saved");
		
		
	}

}
