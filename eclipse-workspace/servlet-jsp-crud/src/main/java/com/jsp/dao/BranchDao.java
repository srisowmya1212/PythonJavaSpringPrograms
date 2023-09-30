package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Branch;

public class BranchDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("servletcrud");
	public Branch save(Branch branch) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if(branch!=null) {
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
		}
		return branch;
		
	}
	public Branch update(Branch branch) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch2=entityManager.find(Branch.class, branch.getId());
		if(branch2!=null) {
			entityTransaction.begin();
			entityManager.merge(branch);
			entityTransaction.commit();
		}
		return branch2;
		
	}
	public Branch delete(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, id);
		if(branch!=null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
		}
		return branch;
	}
	public List<Branch> getAll(){
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select b from Branch b");
		List<Branch> list=query.getResultList();
		return list;
		
		
	}
	public Branch getById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Branch branch=entityManager.find(Branch.class, id);
		return branch;
	}
	public List<Branch> login(Branch branch) {
		EntityManager  entityManager=entityManagerFactory.createEntityManager();
		String email=branch.getEmail();
		String password=branch.getPassword();
		Query query=entityManager.createQuery("select b from Branch b where email=?1 and password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<Branch> list=query.getResultList();
		if(list.size()>0) {
			for(Branch branch2:list) {
				if(branch2.getEmail().equals(branch.getEmail()) && branch2.getPassword().equals(branch.getPassword())){
					return list;
				}
			}
		}
		return null;
		
	}
	

}
