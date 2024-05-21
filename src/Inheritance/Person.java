package Inheritance;

public class Person {
	String name;
	int age;
	String address;
	
	public Person(String n, int a, String add) {
		name = n;
		age=a;
		address=add;
	}
	
	public void printPerson() {
		System.out.println("Name of the person: " + name);
		System.out.println("Age of the person: " + age);
		System.out.println("Address of the person: " + address);
	}
	
	
}
