package com.jsp.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestPositionalBasedQueryParameter {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("first");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		 Query query=entityManager.createQuery("select u from User u where name=? 10");//by name
//		 query.setParameter(10, "vani");
		// Query query=entityManager.createQuery("select u from User u where
		// age=?11");//by age
		// query.setParameter(11, 21);
		// Query query=entityManager.createQuery("select u from User u where
		// id=?12");//by id
		// query.setParameter(12, 2);
		Query query = entityManager.createQuery("select u from User u where age=?13 and name=?14");
		query.setParameter(13, 30);
		query.setParameter(14, "vani");
		List<User> list = query.getResultList();
		if (list.size() > 0) {
			for (User user : list) {
				System.out.println("user id: " + user.getId());
				System.out.println("user name: " + user.getName());
				System.out.println("user age: " + user.getAge());
				System.out.println("user phone num:  " + user.getPhonenum());
				System.out.println("-----------------------------------------");
			}
		} else {
			System.out.println("plz check the data");
		}

	}

}
