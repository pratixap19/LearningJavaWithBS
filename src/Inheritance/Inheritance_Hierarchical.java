package Inheritance;

class Parent{
	int a;
	public void dispaly() {
		System.out.println("class Parent : " + a);
	}
}

class Child1 extends Parent{
	int b;
	public void print() {
		System.out.println("class Child1 : " + b);
	}
}

class Child2 extends Parent{
	int c;
	public void swim() {
		System.out.println("class Child2 : " + c);
	}
}

public class Inheritance_Hierarchical {

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.a=10;
		obj.b=40;
		obj.dispaly();
		obj.print();
		System.out.println("****************");
		
		Child2 obj2=new Child2();
		obj2.a=20;
		obj2.c=30;
		obj2.swim();
		obj2.dispaly();

	}

}
