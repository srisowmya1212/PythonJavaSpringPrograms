package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/secondurl")

public class SecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		String i=req.getParameter("id");
		String n=req.getParameter("name");
		out.println("Id:  "+ i);
		out.println("Name: "+n);
		
	}

}
