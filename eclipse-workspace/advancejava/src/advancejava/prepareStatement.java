package advancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class prepareStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Srisowmya@12");
		//PreparedStatement p=connection.prepareStatement("create table school(rollno int,name varchar(40))");
		PreparedStatement p=connection.prepareStatement("insert into school values(12,'Srisowmya')");
		p.executeUpdate();
		connection.close();
		System.out.println("successfully created");
		

	}

}
