package com.skss.spring.configuration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServletController {
	@RequestMapping("emp")
     public void emp(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		PrintWriter out=resp.getWriter();
		out.println("id number is:  "+id);
		out.println("Name is: "+name);
	}	
		
		@RequestMapping("student")

		public void student(HttpServletRequest req,HttpServletResponse resp) throws IOException {
			int id=Integer.parseInt(req.getParameter("id"));
			String n=req.getParameter("name");
			String c=req.getParameter("clg");
			String s=req.getParameter("stream");
			double p=Double.parseDouble(req.getParameter("percentage"));
			PrintWriter out=resp.getWriter();
			out.println("Id is: "+ id);
			out.println("name is: "+n);
			out.println("college name is: "+c);
			out.println("stream is: "+ s);
			out.println("percentage is: "+p);
		}
	
		
	
}
