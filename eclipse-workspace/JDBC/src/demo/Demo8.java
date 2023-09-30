package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Demo8 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=Srisowmya@12");
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select *  from employee");
			System.out.println(resultset);
			while(resultset.next()) {
				System.out.println("Id: "+resultset.getInt(1));
				System.out.println("Name:"+resultset.getString(2));
				System.out.println("Age:"+resultset.getInt(3));
				System.out.println("-----------------------------");
			}
			connection.close();
			System.out.println(resultset);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
