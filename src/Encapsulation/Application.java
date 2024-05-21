package Encapsulation;

public class Application {

	public static void main(String[] args) {
		Employee e = new Employee();
		//e.empId=1;
		//e.name="Pratixa";
		
		//System.out.println(e.empId);
		//System.out.println(e.name);
		
		System.out.println(e.getEmpId());//It will return default value 0
		
		e.setEmpId(5);
		System.out.println(e.getEmpId());
		
		e.setEmpName("Pratixa");
		System.out.println(e.getEmpName());
		
		e.setEmpSalary(6000.55f);
		System.out.println(e.getEmpSalary());
	}

}
