package advancejava;

public class CandidateDto {
	private int id;
	private String Name;
	private int Age;
	@Override
	public String toString() {
		return "CandidateDto [id=" + id + ", Name=" + Name + ", Age=" + Age + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}

}
