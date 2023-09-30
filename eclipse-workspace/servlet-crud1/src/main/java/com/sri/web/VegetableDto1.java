package com.sri.web;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VegetableDto1 {
	@Id
	private int id;
	private String vegetable;
	private double cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVegetable() {
		return vegetable;
	}
	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "VegetableDto1 [id=" + id + ", vegetable=" + vegetable + ", cost=" + cost + "]";
	}
	
	

}
