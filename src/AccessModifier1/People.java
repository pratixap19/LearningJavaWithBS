package AccessModifier1;

import AccessModifier.Employee;

public class People extends Employee{

	public static void main(String[] args) {
		People p = new People();
		p.empName = "Rahul";
		System.out.println(p.empName);
		p.empAdd="New Delhi";
		System.out.println(p.empAdd);

	}

}
