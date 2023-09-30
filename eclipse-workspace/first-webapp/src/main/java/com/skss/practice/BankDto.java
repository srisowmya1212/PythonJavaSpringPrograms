package com.skss.practice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankDto {
	@Id
	private int id;
	private String name;
	private long accNo;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankDto [id=" + id + ", name=" + name + ", accNo=" + accNo + ", balance=" + balance + "]";
	}
	

}
