package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/student")

public class StudentServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	  StudentDto dto=new StudentDto();
	  dto.setId(   Integer.parseInt( req.getParameter("id"))   );
	  dto.setName(   req.getParameter("name")   );
	  dto.setEnglish(  Integer.parseInt(req.getParameter("english"))  );//if it is double datatype then Double.parseDouble(req.getParameter("english"));
	  dto.setMaths(  Integer.parseInt(req.getParameter("maths"))  );
	  dto.setScience(  Integer.parseInt(req.getParameter("science"))  );
	  
	  StudentDaoImpl dao=new StudentDaoImpl();
	  dao.save(dto);
	  PrintWriter out=res.getWriter();
	  out.println("saved successfully");
		
	}

}
