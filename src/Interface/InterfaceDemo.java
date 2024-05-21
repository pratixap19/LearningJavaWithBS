package Interface;

interface Shape{
	int length=10;//by default final and static variables
	int width=20;//by default final and static variables
	
	void circle();//abstract method
	
	//Interface allows default and static methods from Java8 onwards
	default void square() {
		System.out.println("This is square-default method");
	}
	
	static void rectangle() {
		System.out.println("This is rectangle-static method");
	}
}

public class InterfaceDemo implements Shape{
	
	public void circle() {
		System.out.println("This is circle-abstract method");
	}
	
	public void triangle() {
		System.out.println("This is triangle method");
	}

	public static void main(String[] args) {
		//scenario 1
		InterfaceDemo obj = new InterfaceDemo();
		obj.square();
		obj.circle();
		obj.triangle();
		Shape.rectangle();//static method can directly access from interface
		
		//scenario 2
		Shape sh=new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();//static method can directly access from interface
	}

	
	

}
