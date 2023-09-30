package demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo7 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=Srisowmya@12");
			CallableStatement callableStatement=connection.prepareCall("call jdbc_call(?,?,?)");
			callableStatement.setInt(1, 1);
			callableStatement.setString(2, "sri");
			callableStatement.setInt(3, 21);
		    callableStatement.executeUpdate();
		    connection.close();
		    System.out.println("data saved successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
