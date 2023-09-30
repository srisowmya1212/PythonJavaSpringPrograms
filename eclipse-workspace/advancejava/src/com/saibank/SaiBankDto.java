package com.saibank;

public class SaiBankDto {
	private int id;
	private String accHolderName;
	private long accNo;
	private double balance;
	private int penalty;
	private String penalty_status;
	private double total_balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
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
	public int getPenalty() {
		return penalty;
	}
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	public String getPenalty_status() {
		return penalty_status;
	}
	public void setPenalty_status(String penalty_status) {
		this.penalty_status = penalty_status;
	}
	public double getTotal_balance() {
		return total_balance;
	}
	public void setTotal_balance(double total_balance) {
		this.total_balance = total_balance;
	}
	@Override
	public String toString() {
		return "SaiBankDto [id=" + id + ", accHolderName=" + accHolderName + ", accNo=" + accNo + ", balance=" + balance
				+ ", penalty=" + penalty + ", penalty_status=" + penalty_status + ", total_balance=" + total_balance
				+ "]";
	}
	
	
	
}