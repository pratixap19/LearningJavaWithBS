package Inheritance;

public class Runner {

	public static void main(String[] args) {
		Student std1 = new Student("Mike", 25, "US", "Java", 500);
		std1.printStudent();
		
		Professor p1 = new Professor("Smit", 35, "US", 4000, 5);
		p1.printProfessor();
		

	}

}
