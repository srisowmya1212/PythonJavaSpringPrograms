package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3 {

	public static void main(String[] args) {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Srisowmya@12");
			Statement s=connection.createStatement();
			s.execute("update user set name='srisowmya' where id=1");
			
			System.out.println("Execution successful");
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
