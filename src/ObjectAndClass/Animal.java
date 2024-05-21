package ObjectAndClass;

public class Animal {
	
	String voice;
	int legs;
	int tail;
	int eyes=2;
	String color;
	int hieght;
	String gender;
	
	public void barking() {
		System.out.println("Animal is barking");
	}
	
	public void eating() {
		System.out.println("Animals eat");
	}
	
	public void running() {
		System.out.println("Animals run very fast");
	}
	
	public static void main(String[] args) {
		Animal obj = new Animal();
		System.out.println("Eyes of the animals are : " + obj.eyes);
		obj.barking();
		obj.eating();
		obj.running();
		//how to print class name in Java?
		Class<?> HumanClass = Animal.class;
		System.out.println(HumanClass.getName());
		Class<Animal> classname = Animal.class;
		System.out.println(classname.getName());
	}

}
