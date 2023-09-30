package com.skss.hibernate_empprj;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("emp");//persistence unit we are providing in emp
        EntityManager entityManager=emf.createEntityManager();
        EntityTransaction et=entityManager.getTransaction();
        Emp dto=new Emp();
        dto.setId(1);
        dto.setName("sri");
        dto.setSalary(200000);
        et.begin();
        entityManager.persist(dto);
        et.commit();
    }
}
