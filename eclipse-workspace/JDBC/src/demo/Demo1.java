package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
		
			try {
			    Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Srisowmya@12");
				Statement s=connection.createStatement();
				s.execute("create table user(id  int primary key,name varchar(40),phn bigint(10))");
				System.out.println("Execution successful");
				connection.close();
			
			} catch (ClassNotFoundException | SQLException e) { }
			
		

	}

}
