package servlet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDaoImpl {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("first");
    EntityManager entityManager=emf.createEntityManager();
    EntityTransaction et=entityManager.getTransaction();
    public void save(StudentDto dto) {
    	et.begin();
    	entityManager.persist(dto);
    	et.commit();
    	
    }
}
