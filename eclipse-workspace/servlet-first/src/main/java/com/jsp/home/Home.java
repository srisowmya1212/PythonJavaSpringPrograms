package com.jsp.home;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.jsp.user.User;

@WebServlet("/home")
public class Home extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("servlet");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select u from User u where email=?1 and password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<User> list=query.getResultList();
		if(list!=null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("home2.html");
			dispatcher.forward(req, res);
			
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("home.html");
			dispatcher.include(req, res);
		}
		
	}

}
