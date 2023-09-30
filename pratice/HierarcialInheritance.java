package com.sri.oops;

public class HierarcialInheritance {
	public static void main(String[] args) {
		H obj=new H();
		obj.sleep();
		obj.eat();
		//obj.bark();compilation error
		obj.play();
		System.out.println("--------------------");
		G obj1=new G();
		obj1.bark();
		obj1.eat();
		obj1.play();
		//obj1.sleep(); compilation error
		System.out.println("...........................");
		F obj2=new H();
		obj2.eat();
		obj2.play();
//		obj2.bark(); 
//		obj2.sleep();
		System.out.println("..............................");
	}

}
class F{
	public void eat() {
		System.out.println("I am eating");
	}
	public void play() {
		System.out.println(" i am playing f");
	}
}
class G extends F{
	public void bark() {
		System.out.println("I am barking");
	}
	public void play() {
		System.out.println(" i am playing g");
	}
}
class H extends F{
	public void sleep() {
		System.out.println("I am sleeping");
	}
	public void play() {
		System.out.println(" i am playing h");
	}
}
