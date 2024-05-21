package MethodOverriding;

public class Calculator {
	
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Sum of two values are:" + c);
	}
	
	public static void main(String[] args) {
		MethodOverridingDemo m= new MethodOverridingDemo();
		m.add(12, 10);
	}
}
