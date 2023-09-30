package com.skss.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankDaoImpl {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("first");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		BankDto dto=new BankDto();
		dto.setId(1);
		dto.setName("sri");
		dto.setAccNo(157687879);
		dto.setBalance(3576);
		et.begin();
		entityManager.persist(dto);
		et.commit();
	}

}
