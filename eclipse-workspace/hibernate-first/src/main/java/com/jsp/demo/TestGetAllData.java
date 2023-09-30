package com.jsp.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select u from User u");
		List<User> list=query.getResultList();
		for(User user:list) {
			System.out.println("user id: "+user.getId());
			System.out.println("user name: "+user.getName());
			System.out.println("user age: "+user.getAge());
			System.out.println("user phone num:  "+user.getPhonenum());
			System.out.println("-----------------------------------------");
		}
	}

}
