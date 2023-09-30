package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Branch;
import com.jsp.service.BranchService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		BranchService service=new BranchService();
		Branch branch=new Branch();
		branch.setEmail(email);
		branch.setPassword(password);
		List<Branch> list=service.loginService(branch);
		if(list!=null) {
		  RequestDispatcher dispatcher=req.getRequestDispatcher("branchhome.jsp");
		   dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, resp);
		}
	}

}
