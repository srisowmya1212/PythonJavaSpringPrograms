package com.skss.hibernate_empprj;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class AndraStudentDto {
	@Id
	private int id;
	private String name;
	private double english;
	private double maths;
	private double science;
	private double result;
	private double percentage;
	private String grade;
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
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getScience() {
		return science;
	}
	public void setScience(double science) {
		this.science = science;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "AndraStudentDto [id=" + id + ", name=" + name + ", english=" + english + ", maths=" + maths
				+ ", science=" + science + ", result=" + result + ", percentage=" + percentage + ", grade=" + grade
				+ "]";
	}
	
	

}
