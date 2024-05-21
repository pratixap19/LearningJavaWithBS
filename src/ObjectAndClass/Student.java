package ObjectAndClass;

public class Student {
	int rollNo;
	String name;
	
	public void attendClass() {
		System.out.println("Students attend class");
	}
	
	public void giveExam() {
		System.out.println("Students give exams");
	}
	
	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.rollNo=5;
		obj.name="Robert";
		System.out.println("Student roll number is:"  + obj.rollNo);
		System.out.println("Student name is:" + obj.name);
		obj.attendClass();
		obj.giveExam();
		//Print class name
		Class<Student> className = Student.class;
		System.out.println(className.getName());

	}

}
