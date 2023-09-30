package pratice;

//class test3{
//	int i=10;
//}
//class test2 extends test3{
//	int i=20;
//}
//class test1 extends test2{
//	int i=30;
//}
class test1{
	int i=10;
}
class test2 extends test1{
	 int i=20;
}
class test3 extends test2{
	int i=30;
	
	
}

public class Test {
	public static void main(String[] args) {
		test1 test=new test3();
		System.out.println(test.i);
	}

}
