package com.saibank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SaiBankDaoImpl {
	static Connection  c=null;//to declare and use this to every methods we declare as global variables
	static String url="jdbc:mysql://localhost:3306/talentschool";
	static String user="root";
	static String pwd="Srisowmya@12";
	
	
	static {//to reduce the lines of code we use SIB bcoz in every method it is not necessary to connect to db
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection(url, user, pwd);//here we didn't give connection directly bcoz it becomes  local when we provide here
		} catch (ClassNotFoundException | SQLException e) {
			
         }
		
	}
	public  void save(SaiBankDto dto) throws SQLException {//used to save data in database
		PreparedStatement p=c.prepareStatement("insert into saibank values(?,?,?,?,?,?,?)");
		p.setInt(1, dto.getId());
		p.setString(2, dto.getAccHolderName());
		p.setLong(3, dto.getAccNo());
		p.setDouble(4, dto.getBalance());
		p.setInt(5, dto.getPenalty());
		p.setString(6, dto.getPenalty_status());
		p.setDouble(7, dto.getTotal_balance());
		
		p.executeUpdate();
		System.out.println("saved");
		
	}
	public void update(SaiBankDto dto) {
		
	}
	public void retrieveById(int id) {
		
	}
	public void retrieveAll() throws SQLException {
		PreparedStatement p=c.prepareStatement("select * from saibank");
		ResultSet resultSet=p.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+","+resultSet.getString(2)+",");
			System.out.println(resultSet.getLong(3)+","+resultSet.getDouble(7)+"\n");
		}
		
		
		
	}
	public void deleteById(int id) {
		
	}
	

}
