 package com.saibank;

import java.sql.SQLException;
import java.util.Scanner;

public class SaiBankController2 {

	public static void main(String[] args) throws SQLException {
	  SaiBankService2 service=new SaiBankService2();
	  Scanner sc=new Scanner(System.in);
	  boolean condition=true;
	  while(condition) {
		  System.out.println("1.Save 2.update 3.GetList 4.exit");
		  int choice=sc.nextInt();
		  switch(choice) {
		  case 1:{
			  System.out.println("enter 1.id 2.name 3.accNo 4.balance");
			  SaiBankDto dto=new SaiBankDto();
			  dto.setId(sc.nextInt());
			  dto.setAccHolderName(sc.next());
			  dto.setAccNo(sc.nextLong());
			  dto.setBalance(sc.nextDouble());
			  service.save(dto);
			  break;
		  }
		  case 2:{
			  System.out.println("enter 1.id 2.name 3.accNo 4.balance");
			  SaiBankDto dto=new SaiBankDto();
			  dto.setId(sc.nextInt());
			  dto.setAccHolderName(sc.next());
			  dto.setAccNo(sc.nextLong());
			  dto.setBalance(sc.nextDouble());
			  service.save(dto);
			  break;
			  
		  }
		  case 3:{
			  System.out.println("_______customers list_____");
			  service.retrieveAll();
			  break;
		  }
		  case 4:{
			  System.out.println("exit");
			  condition=false;
			  break;
		  }
		  }
	  }

	}

}
