package Encapsulation;

public class Employee {
	
	/*What is encapsulation?
	 * Encapsulation is a mechanism in Java of binding variables and methods 
	 * together and create single unit in a class.
	 * In encapsulation, a class's variables are hidden from other classes 
	 * and can only be access by the methods of the class in which they are present.
	 * 
	 * It is used for data hiding and security purpose.
	 * To have control on data we mark variables as private.
	 * 
	 * It is achieved by two ways.
	 * 1. By access modifier
	 * private: accessible only inside the class
	 * default: accessible only inside the package
	 * protected: accessible inside the package and outside of the package through inheritance
	 * public: accessible everywhere in the class, package, outside of the package without inheritance.
	 * 
	 * 2. By getter and setter method
	 * 
	 */
	 private int empId;
	 private String name;
	 private float salary;
	 
	 public int getEmpId() {
		 return empId;
	 }
	 
	 public void setEmpId(int e) {
		 if(e==1 || e==5 || e==3) {
			 this.empId=e; 
		 }
		 else {
			 System.out.println("It is an invalid employee Id");
		 }
		 
	 }
	 
	 public String getEmpName() {
		 return name;
	 }
	 
	 public void setEmpName(String n) {
		 this.name=n;
	 }
	 
	 public float getEmpSalary() {
		 return salary;
	 }
	 
	 public void setEmpSalary(float s) {
		 this.salary=s;
	 }

	
	
}
