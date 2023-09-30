package com.skss.hibernate_empprj;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AndraStudentDaoImpl {
          EntityManagerFactory emf=Persistence.createEntityManagerFactory("emp");
          EntityManager entityManager=emf.createEntityManager();
          EntityTransaction et=entityManager.getTransaction();
          public void save(AndraStudentDto dto) {
        	  et.begin();
        	  entityManager.persist(dto);
        	  et.commit();
        	  System.out.println("saved");
          }
	     public void getStudentById(int id) {
	    	 AndraStudentDto dto=entityManager.find(AndraStudentDto.class, id);
	    	 System.out.println(dto);
	     }
	    public void updateStudent(AndraStudentDto dto) {
	    	et.begin();
	    	entityManager.merge(dto);
	    	et.commit();
	    	System.out.println("updated");
	    	
	    	
	    }
	    public void getAllStudents() {
	    	Query q=entityManager.createQuery("select s from AndraStudentDto s");
	    	List<AndraStudentDto> students=q.getResultList();
	    	System.out.println(students);
	    }
	    public void deleteStudent(int id) {
	    	AndraStudentDto student =entityManager.find(AndraStudentDto.class,id);
	    	et.begin();
	    	entityManager.remove(student);
	    	et.commit();
	    	System.out.println("deleted");
	    }

}
