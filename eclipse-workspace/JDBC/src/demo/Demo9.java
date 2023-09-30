package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo9 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=Srisowmya@12");
			PreparedStatement preparedStatement=connection.prepareStatement(" ");
			
			ResultSet resultset=preparedStatement.executeQuery("select * from employee where id=?");
			preparedStatement.setInt(1, 0);
			while(resultset.next()) {
				System.out.println("id: "+resultset.getInt(1));
				System.out.println("name:"+resultset.getString(2));
				System.out.println("age:"+resultset.getInt(3));
				System.out.println("----------------------------------------");
			}
			
			connection.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
