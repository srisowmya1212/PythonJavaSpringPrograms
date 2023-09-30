package Array;

public class Pattern {

	public static void main(String[] args) {
		int space=4,star=-1;
		for(int i=1;i<=4;i++) {
			space--;star+=2;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(i==2&&j==2 || i==4&&j==2) {
					System.out.print(j);
				}
				else if(i==3&&j==2) {
					System.out.print("b");
				}
				else if(i==3&&j==4) {
					System.out.print("d");
				}
				else if(i==4&&j==4 || i==4&&j==6 ) {
					System.out.print(j);
				}
				
				
				else {
					System.out.print("*");
				}
			}
			System.out.println(" ");	
		}
		

	}

}
