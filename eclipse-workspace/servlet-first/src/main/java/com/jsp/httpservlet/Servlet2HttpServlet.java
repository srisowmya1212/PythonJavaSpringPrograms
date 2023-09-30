package com.jsp.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.user.User;
@WebServlet("/login")
public class Servlet2HttpServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		User user=new User();
		user.setId(id);
		user.setAge(age);
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("servlet");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		if(user!=null) {
			entityTransaction.begin();
			entityManager.persist(user);
			entityTransaction.commit();
			PrintWriter printWriter=resp.getWriter();
			printWriter.println("data saved");
		}
		
	}

}
