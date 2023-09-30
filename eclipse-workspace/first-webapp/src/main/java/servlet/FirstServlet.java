package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	    PrintWriter out=res.getWriter();
	    out.println("Id: "+req.getParameter("id"));
	    out.println("Name: "+req.getParameter("name"));
	    out.println("English: "+req.getParameter("english"));
	    out.println("Maths: "+req.getParameter("maths"));
	    out.println("Science: "+req.getParameter("science"));
	   
		
	}

}
