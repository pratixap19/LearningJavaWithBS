package AccessModifier1;

import AccessModifier.Employee;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.empName="Pratixa";
		System.out.println(e.empName);
		
		//e.empAdd; - not possible
		//e.companyName; - not possible
		

	}

}
