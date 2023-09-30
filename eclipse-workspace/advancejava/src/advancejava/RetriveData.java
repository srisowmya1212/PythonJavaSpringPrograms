package advancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "Srisowmya@12");
		Statement s=connection.createStatement();
		ResultSet res=s.executeQuery("select * from thiru");
		while(res.next()) {
		System.out.println(res.getInt(1)+" |"+res.getString(2)+" |"+res.getString(3));
		}
		connection.close();
		System.out.println("successfully retrieved");

	}

}
