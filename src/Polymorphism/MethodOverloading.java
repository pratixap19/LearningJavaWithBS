package Polymorphism;

public class MethodOverloading {
	/* 4 rules are applicable
	 * 1. Method name should be same
	 * 2. number of parameters should be different
	 * 3. data type of parameters should be different
	 * 4. order of parameters should be different
	 * 
	 */
	
	int a=10,b=20;
	
	public void sum() {
		System.out.println(a+b);
	}

	public void sum(int x, int y) {
		System.out.println(x+y);
	}

	public void sum(int x, double y) {
		System.out.println(x+y);
	}

	public void sum(double x, int y) {
		System.out.println(x+y);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.sum();//1st method will call
		obj.sum(100,200);//2th method will call
		obj.sum(10.5, 20);//4th method will call
		obj.sum(10, 15.5);//3rd method will call
		obj.sum(10,20,30);////5th method will call
	}

}
