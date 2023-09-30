package com.mvc;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

@Repository //2  class we need to create
public class PersonDaoImpl {
	
	EntityManager entityManager=Factory.getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public String savePerson(PersonModel person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return person.getName() + " is saved";
		
	}

}
