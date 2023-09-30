package com.sri.web;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VegDaoImpl1 {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("first");
	EntityManager entityManager=emf.createEntityManager();
	EntityTransaction et=entityManager.getTransaction();
	
	public String save(VegetableDto1 veg) {
		et.begin();
		entityManager.persist(veg);
		et.commit();
		return "saved";
		
	}
	public static void main(String[] args) {
		VegDaoImpl1 dao=new VegDaoImpl1();
		VegetableDto1 veg=new VegetableDto1();
		veg.setId(2);
		veg.setVegetable("ladyfinger");
		veg.setCost(60);
		dao.save(veg);
	}

}
