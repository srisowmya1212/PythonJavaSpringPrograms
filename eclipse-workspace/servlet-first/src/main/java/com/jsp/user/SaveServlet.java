package com.jsp.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/save")
public class SaveServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		User user=new User();
		user.setId(id);
		//user.setId(Integer.parseInt(req.getParameter("id")));
		user.setName(name);
		user.setAge(age);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("servlet");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if(user!=null) {
			entityTransaction.begin();
			entityManager.persist(user);
			entityTransaction.commit();
			System.out.println("data saved");
			PrintWriter printWriter=res.getWriter();
			printWriter.println("Data saved");
			
		}
		
		
	}

}
