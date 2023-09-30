package pratice;

public class MethodOverriding {
	public static void main(String[] args) {
		B obj=new B();
		obj.run();//from b
		obj.cry();
		obj.play();//to use play method present in b we have to store b obj in b
		A obj1= new A();
		obj1.run();//from a
		obj1.cry();
		
		
		A obj2=new B();
		obj2.run();// from b  bcoz b obj is stored in a
		obj2.cry();// we cannot use play method present in b bcoz as we are storing reference in a
		
		//To access all class a method create obj of a and store in a 
		//to access all b method store obj in b
		//if we create b obj and store in a ,we can access a class methods , but the ovverrided method get the result of immmediate class method
		
	}
}
	
	class A{
		public void run() {
			System.out.println(" from class A");
		}
		public void cry() {
			System.out.println("cry method in a");
		}
	}
	class B extends A{
		public void run() {
			System.out.println("from b");
		}
		public void play() {
			System.out.println("play method in b");
		}
	}


