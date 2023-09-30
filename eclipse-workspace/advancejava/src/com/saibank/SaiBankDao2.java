package com.saibank;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SaiBankDao2 {
	static Connection  c=null;
	static String url="jdbc:mysql://localhost:3306/talentschool";
	static String user="root";
	static String pwd="Srisowmya@12";
	
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection(url, user, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			
         }
		
	}
	public  void save(SaiBankDto dto) throws SQLException {
		//PreparedStatement p=c.prepareStatement("insert into saibank values(?,?,?,?,?,?,?)");
		CallableStatement p=c.prepareCall("{call saveCustomers(?,?,?,?,?,?,?)}");
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
	public void update(SaiBankDto dto) throws SQLException {
		CallableStatement p=c.prepareCall("{call updateCustomers(?,?,?,?,?,?,?)}");
		p.setInt(1, dto.getId());
		p.setString(2, dto.getAccHolderName());
		p.setLong(3, dto.getAccNo());
		p.setDouble(4, dto.getBalance());
		p.setInt(5, dto.getPenalty());
		p.setString(6, dto.getPenalty_status());
		p.setDouble(7, dto.getTotal_balance());
		
		p.executeUpdate();
		System.out.println("updated");
		
	}
	public void retrieveById(int id) {
		
	}
	public void retrieveAll() throws SQLException {

		CallableStatement p=c.prepareCall("{call getAllCustomers()}");
		ArrayList<SaiBankDto> customers=new ArrayList<SaiBankDto>();
		ResultSet rset=p.executeQuery();
		while(rset.next()) {
			SaiBankDto dto=new SaiBankDto();
			dto.setId(rset.getInt(1));
			dto.setAccHolderName(rset.getString(2));
			dto.setAccNo(rset.getLong(3));
			dto.setBalance(rset.getDouble(4));
			dto.setPenalty(rset.getInt(5));
			dto.setPenalty_status(rset.getString(6));
			dto.setTotal_balance(rset.getDouble(7));
			customers.add(dto);
			System.out.println(dto);// to get full details of all customers
			
			
		}
		System.out.println("customers");
		//System.out.println(customers);//here we get only 1 customer details
		
		}
		
		
		
	
	public void deleteById(int id) {
		
	}
	




}
