package MethodOverriding;

public class MethodOverridingDemo extends Calculator{
	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Sum of two values are:" + c);
		System.out.println("Just execute in this class");
		int d=a-b;
		System.out.println("Substraction is:" + d);
	}
}
