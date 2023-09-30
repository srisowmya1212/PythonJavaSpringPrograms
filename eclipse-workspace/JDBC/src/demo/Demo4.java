package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo4 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Srisowmya@12");
		    PreparedStatement ps=connection.prepareStatement("update user set name='arunsai mattaparthi' where id=2");
		    
//		    ps.setInt(1, 2);
//		    ps.setString(2, "arun");
//		    ps.setInt(3, 34535646);
		    ps.executeUpdate();
		    connection.close();
		    System.out.println("executed successfully");
		    
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("execution failed");
		}
		

	}

}
