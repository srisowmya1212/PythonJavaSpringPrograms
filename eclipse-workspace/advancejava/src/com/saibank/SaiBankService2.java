package com.saibank;

import java.sql.SQLException;

public class SaiBankService2 {
	SaiBankDao2 dao=new SaiBankDao2();
	public int penalty(double balance) {
		return (balance>=1000) ? 20 :-40;
	}
	public String penalty_status(double balance) {
		return(balance>=1000)?"no":"yes";
	}
	public double total_balance(double balance) {
		return balance+penalty(balance);
	}
	public  void save(SaiBankDto dto) throws SQLException {
		dto.setPenalty(penalty(dto.getBalance()));
		dto.setPenalty_status(penalty_status(dto.getBalance()));
		dto.setTotal_balance(total_balance(dto.getBalance()));
		//transferring data to dao layer
		dao.save(dto);
		
	}
	public void retrieveAll() throws SQLException {
		dao.retrieveAll();
	}
	public void update(SaiBankDto dto) throws SQLException {
		dto.setPenalty(penalty(dto.getBalance()));
		dto.setPenalty_status(penalty_status(dto.getBalance()));
		dto.setTotal_balance(total_balance(dto.getBalance()));
		//transferring data to dao layer
		dao.update(dto);
	}


}
