package com.skss.hibernate_empprj;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class TerroristDto {
	@Id
	private int id;
	private String name;
	private int rating;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "TerroristDto [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	

}
