package servlet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class StudentDto {
	@Id
	private int id;
	private String name;
	private int english;
	private int maths;
	private int science;
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
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", english=" + english + ", maths=" + maths + ", science="
				+ science + "]";
	}
	

}
