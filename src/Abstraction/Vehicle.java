package Abstraction;

public abstract class Vehicle {
	
		String name;
		// we can create constructor in Abstract class but not in an interface.
		public Vehicle(String n) {
			name=n;
		}
		//abstract method
		public abstract void run();
		
		//non abstract method
		public void testMethod() {
			System.out.println("This is non abstract method of Vehical class");
		}
}
