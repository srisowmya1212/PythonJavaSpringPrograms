package com.sri.oops;

import java.util.Objects;

public class Employee {
    String eid;
    double sal;
	public Employee(String eid, double sal) {
		super();
		this.eid = eid;
		this.sal = sal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(eid, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(eid, other.eid) && Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}
    
}
