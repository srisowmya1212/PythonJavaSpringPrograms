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
@WebServlet("/display")
public class GetAllServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BranchService service=new BranchService();
		List<Branch> list=service.getAllService();
		if(list.size()>0) {
			req.setAttribute("keyname", list);
			RequestDispatcher dispatcher=req.getRequestDispatcher("displaybranch.jsp");
			dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("branchhome.jsp");
			dispatcher.include(req, resp);
		}
	}

}
