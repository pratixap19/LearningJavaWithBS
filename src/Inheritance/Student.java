package Inheritance;

public class Student extends Person {
	
	String courseName;
	int fees;
	
	public Student(String nm, int ag, String add, String cn, int fee) {
		super(nm, ag, add);
		courseName = cn;
		fees=fee;
	}
	public void printStudent() {
		System.out.println(courseName);
		System.out.println(fees);
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		
	}
}
