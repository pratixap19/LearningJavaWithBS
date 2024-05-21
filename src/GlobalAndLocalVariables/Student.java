package GlobalAndLocalVariables;

public class Student {
	//global variable has 2 types. 1. instance variable, 2. Static variable
	int s_rollNo;//instance variable
	String s_name;
	static String s_collegeName="UMASS";
	
	public void m1() {
		int i=20;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.s_rollNo=10);
		System.out.println(s.s_name="Pratixa");
		System.out.println(s.s_collegeName);
		s.m1();
		
		Student s1=new Student();
		System.out.println(s1.s_rollNo=10);
		System.out.println(s1.s_name="Preya");
		System.out.println(s1.s_collegeName);
		

	}

}
