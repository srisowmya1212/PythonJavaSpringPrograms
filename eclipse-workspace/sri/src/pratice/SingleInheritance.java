package pratice;

public class SingleInheritance {
	public static void main(String[] args) {
		E obj=new E();
		obj.bark();
		obj.eat();
	}

}
class D{
	public void eat() {
		System.out.println("I am eating");
	}
}
class E extends D{
	public void bark() {
		System.out.println("I am barking");
	}
}
