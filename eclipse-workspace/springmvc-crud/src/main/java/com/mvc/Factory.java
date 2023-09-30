package com.mvc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Factory {
	public static EntityManager getEntityManager() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("login");
		return emf.createEntityManager();
		
	}

}
