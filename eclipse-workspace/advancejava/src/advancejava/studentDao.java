package advancejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class studentDao {//In data access object we give connection to database to create table and get values to insert into it.
	public void use(studentDto dto) throws SQLException, ClassNotFoundException {
		//int id=dto.getId();
		//String name=dto.getName();
		//String sql="create table student.studetails( id int,Name varchar(40))";
	
		//String sql="insert into studetails values("+id+",'"+name+"')";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Srisowmya@12");
	//Statement s=connection.createStatement();
	//s.executeUpdate("create database student");
	//s.executeUpdate(sql);
	PreparedStatement p=connection.prepareStatement("insert into studetails values(?,?)");
	p.setInt(1, dto.getId());//
	p.setString(2, dto.getName());
	p.executeUpdate();
	

	System.out.println("dao received data from dto successfully");
	connection.close();
	 
	
	}

private int getId(int i) {
	// TODO Auto-generated method stub
	return 0;
}
}
