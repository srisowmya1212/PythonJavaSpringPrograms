package com.skss.hibernate_empprj;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QayamatChimpuController {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("emp");
	static EntityManager entityManager=emf.createEntityManager();
	static EntityTransaction et=entityManager.getTransaction();

	public static void main(String[] args) {
		TerroristDto dto =new TerroristDto();
//		dto.setId(3);
//		dto.setName(" arun");
//		dto.setRating(5);
//		updateTerrorist(dto);
//		getTerroristById(2);
//		save(dto);
         allTerrorists();		
		
	}
	public static void save(TerroristDto dto) {
		et.begin();
		entityManager.persist(dto);
		et.commit();
		System.out.println("saved");
		
		
		
		
	}
	public static void getTerroristById(int id) {
		TerroristDto dto=entityManager.find(TerroristDto.class,id);
		System.out.println(dto);
		
	}
	public static void updateTerrorist(TerroristDto dto) {
		et.begin();
		entityManager.merge(dto);
		et.commit();
		System.out.println("updated");
	}
	public static void allTerrorists() {
		Query q=entityManager.createQuery("select t from TerroristDto t");
		System.out.println(q.getResultList());
	}

}
