package Abstraction;

public class Bike extends Vehicle {

	int speed;
	
	public Bike(String n, int sp) {
		super(n);
		speed = sp;
	}
	public void run() {
		System.out.println("Bike is running");
		
	}
	public void showBike() {
		System.out.println(speed);
		System.out.println("Name of bike is = " + name);
	}
	
	

}
