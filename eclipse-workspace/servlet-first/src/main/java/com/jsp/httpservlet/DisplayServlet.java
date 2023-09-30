package com.jsp.httpservlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.user.User;

public class DisplayServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("servlet");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select a from User a");
		List<User> list=query.getResultList();
		if(list.size()>0) {
			req.setAttribute("keyname", list);
			RequestDispatcher dispatcher=req.getRequestDispatcher("display.html");
			dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
			dispatcher.include(req, resp);
		}
   }

}
