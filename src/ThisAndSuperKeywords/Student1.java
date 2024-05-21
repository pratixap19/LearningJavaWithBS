package ThisAndSuperKeywords;

public class Student1 {
	/*Notes:
	 * this is a keyword in Java and it is a reference variable.
	 * It refers to the current class object.
	 * Usage of this is as below.
	 * 1. It is used to refer current class instance variable.
	 * 2. It is used to invoke current class method(implicitly).
	 * 3. this() can be used to invoke current class constructor.
	 */
	
	int rollNo;
	String name;
	float fee;
	
	public Student1() {
		System.out.println("First constructor");
	}
	
	public Student1(int rollNo, String name, float fee) {
		this();
		this.rollNo=rollNo;
		this.name=name;
		this.fee=fee;
	}
	
	public void display() {
		System.out.println(rollNo + " " + name + " " + fee);
		this.m1();
	}
	
	public void m1() {
		System.out.println("This is test method");
	}
	
	
	public static void main(String[] args) {
		Student1 s=new Student1(19, "Preya", 650.00f);
		s.display();

	}

}
