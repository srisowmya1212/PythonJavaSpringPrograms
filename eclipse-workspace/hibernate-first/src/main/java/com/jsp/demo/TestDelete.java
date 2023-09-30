package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {
	static int id=1;
	public static void main(String[] args) {
		//int id=1;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User user=entityManager.find(User.class, id);
		if(user!=null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			System.out.println("data deleted");
		}
		else {
			System.out.println("plz check the id"+ id);
		}
	}

}
