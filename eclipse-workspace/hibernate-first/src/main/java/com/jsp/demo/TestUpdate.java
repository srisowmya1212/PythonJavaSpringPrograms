package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {
	static int id=3;
	static int  age=21;

	public static void main(String[] args) {
	 //	int id=2;//actually static int id=1; if we write outside the main method
	   //String name="vani";//static string name="satyam"
	//	int age=30;//static int age=40
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User user=entityManager.find(User.class, id);
		
		if(user!=null) {
			//user.setName(name);
			user.setAge(age);
			entityTransaction.begin();
			entityManager.merge(user);
			entityTransaction.commit();
			System.out.println("data updated");
			
		}
		else {
			System.out.println("plz check the id: "+id);
		}

	}

}
