package com.saibank;

import java.sql.SQLException;

public class SaiBankController {

	public static void main(String[] args) throws SQLException {
		SaiBankDto dto=new SaiBankDto();
		//dto.setId(3);
//		dto.setAccHolderName("satyam");
//		dto.setAccNo(5779895622467L);
//		dto.setBalance(1800);
		SaiBankServiceImpl service=new SaiBankServiceImpl();
	//	service.save(dto);
		service.retrieveAll();
		
		
		

	}

}
