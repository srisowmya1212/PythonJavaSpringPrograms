package advancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Srisowmya@12");
		Statement s=connection.createStatement();
		s.executeUpdate("create database movie");
		System.out.println("Execution successful");
		connection.close();
		}
        catch (ClassNotFoundException | SQLException e) {
        	System.out.println("execution failed");
			
		}
		
			
			
			
		}
		
		
       
	}


