package Inheritance;

class X{
	int a;
	public void run() {
		System.out.println("class X : " + a);
	}
}

class Y extends X{
	int b;
	public void walk() {
		System.out.println("class Y : " + b);
	}
}
public class Inheritance_singleLevel {

	public static void main(String[] args) {
		
		X x = new X();
		x.a=10;
		x.run();
		
		System.out.println("**************************");
		
		Y y=new Y();
		y.b=20;
		y.a=30;
		y.run();
		y.walk();
		
	}

}
