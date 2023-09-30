package pratice;

public class MultilevelInheritance {

	public static void main(String[] args) {
		H obj=new H();
		obj.eat();
		obj.bark();
		obj.play();

	}

}
class F {
	public void eat() {
		System.out.println(" I am eating....");
	}
}
class G extends F{
	public void bark() {
		System.out.println("I am barking...");
	}
}
class H extends G{
	public void play() {
		System.out.println("I am playing....");
	}
}
