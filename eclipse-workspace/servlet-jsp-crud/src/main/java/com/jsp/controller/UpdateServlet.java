package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Branch;
import com.jsp.service.BranchService;

@WebServlet("/updatebranch")

public class UpdateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BranchService service = new BranchService();
		
		int id = Integer.parseInt(req.getParameter("id"));
		String bname = req.getParameter("bname");
		String website = req.getParameter("website");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		
		Branch branch = new Branch();
		
		branch.setbName(bname);
		branch.setWebsite(website);
		branch.setEmail(email);
		branch.setPassword(password);
		service.updateService(branch);
		
		if(branch!=null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/display");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("updatebranch.jsp");
			dispatcher.include(req, resp);
		}

	}

}
