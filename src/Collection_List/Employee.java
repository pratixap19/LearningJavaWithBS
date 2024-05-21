package Collection_List;
//followed Naveen Automation
import java.util.ArrayList;
import java.util.Iterator;
//create arrayList for Employee class objects
//how to create user define class arrayList

public class Employee {
	String name;
	int age;
	String department;
	
	public Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Pratixa", 28, "QA");
		Employee emp2 = new Employee("Pranav", 48, "HR");
		Employee emp3 = new Employee("Preya", 18, "Research");
		
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(emp1);
		ar.add(emp2);
		ar.add(emp3);
		
		Iterator<Employee> it = ar.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.department);
			
		}
		
	}

}
