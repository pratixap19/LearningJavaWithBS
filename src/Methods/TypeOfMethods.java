package Methods;

public class TypeOfMethods {
	
	/* two types of methods
	 * 1. static methods
	 * 2. instance methods
	 * 
	 * static method-whenever we don't use any variable inside method or we use only static type
	 * of variable the method we go for static method.
	 * Inside static method only static stuff is accessible
	 * Inside instance method static and non static both stuffs are accessible.
	 * whenever program gets loaded in the memory first information(static variable and static method)is 
	 * loaded that is static information.
	 * */
	
	int i=10;
	static String name="Mahant";

	public void display(){
		System.out.println("I am inside instance method");
		System.out.println(i);
		System.out.println(name);
	}
	
	public static void dip() {
		System.out.println("I am inside static method");
		//System.out.println(i);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		TypeOfMethods t=new TypeOfMethods();
		t.display();
		dip();
	}

}
