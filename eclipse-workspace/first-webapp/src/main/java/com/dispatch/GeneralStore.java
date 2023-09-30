package com.dispatch;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/scan")



public class GeneralStore extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String item=req.getParameter("item");
		RequestDispatcher dispatcher=req.getRequestDispatcher("billing");
		dispatcher.forward(req, res);
		
	}


	

}
