package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Demo6 {

	public static void main(String[] args) {
		try {
			Properties properties=new Properties();
			FileInputStream fileInputStream=new FileInputStream("dbconfig.properties");//to convert the properties file into property object we use fileinput stream
			properties.load(fileInputStream);//to load the fileinputstream object into properties we use load i.e; to connect
			DriverManager.registerDriver(new Driver());
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306", properties);//get connection object is used to connect the jdbc and driver
			//in this getconnection with two parameter we are passing url and property object . we use this method for security bcoz user and password are accessed after creating property object.
			//where as in those two methods we are passing user and password  with url .but here we are giving security to user by hiding user and pw.
			System.out.println(connection);
		} catch (SQLException | IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
