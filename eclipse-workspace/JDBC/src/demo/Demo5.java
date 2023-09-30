package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.mysql.cj.jdbc.Driver;

public class Demo5 {

	public static void main(String[] args) {
		
		//DriverManager.registerDriver(new Driver()); 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=Srisowmya@12");
			//here in getconnection with one parameter we are passing the query with ? and &
			PreparedStatement ps=connection.prepareStatement("insert into user values(?,?,?)");
			ps.setInt(1, 3);
			ps.setString(2, "vani");
			ps.setLong(3, 3232435345l);
			ps.executeUpdate();
			connection.close();
			System.out.println("execution successful");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("execution failed");
			e.printStackTrace();
			
		}
		
		
	}

}
