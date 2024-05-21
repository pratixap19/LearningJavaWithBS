package Inheritance;

class A{
	int a;
	public void display() {
		System.out.println("class A :" + a);
	}
}

class B extends A{
	int b;
	public void print() {
		System.out.println("class B :" + b);
	}
}

class C extends B{
	int c;
	public void show() {
		System.out.println("class C :" + c);
	}
}
public class Inhetitance_multilevel {

	public static void main(String[] args) {
		C c=new C();
		c.a=10;
		c.b=20;
		c.c=30;
		c.display();
		c.print();
		c.show();

	}

}
