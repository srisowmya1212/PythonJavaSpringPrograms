package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Branch;
import com.jsp.service.BranchService;
@WebServlet("/editbranch")

public class GetByIdServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		BranchService service = new BranchService();
		Branch branch = service.getByIdService(id);
		if (branch != null) {
           RequestDispatcher dispatcher=req.getRequestDispatcher("updatebranch.jsp");
           dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("/display");
			dispatcher.include(req, resp);
		}
	}

}
