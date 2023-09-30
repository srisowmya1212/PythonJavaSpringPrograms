package com.saibank;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckProcedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/talentschool", "root", "Srisowmya@12");
		CallableStatement callableStatement=connection.prepareCall("{call getAllCustomers()}");
		ResultSet r=callableStatement.executeQuery();
		while(r.next()) {
			SaiBankDto dto=new SaiBankDto();
			dto.setId(r.getInt(1));
			dto.setAccHolderName(r.getString(2));
			dto.setAccNo(r.getLong(3));
			dto.setBalance(r.getDouble(4));
			dto.setPenalty(r.getInt(5));
			dto.setPenalty_status(r.getString(6));
			dto.setTotal_balance(r.getDouble(7));
			System.out.println(dto);
			}
		

	}

}
