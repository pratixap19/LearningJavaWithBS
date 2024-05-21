package NumberProgramsH;

import java.util.Scanner;
//calculate add, multiplication, substraction and devision using scanner class
//calculate program with double data type
public class Calculator {
	
	public static void addNumbers(double num1, double num2){
		double sum;
		sum = num1+num2;
		System.out.println(sum);	
	}
	
	public static void substractNumbers(double num1, double num2) {
	    double sub;
	    if(num1>num2) {
	    	sub=num1-num2;
		    System.out.println(sub);
	    }else {
	    	System.out.println("We can't substract " + num1 +  " with " + num2);
	    }	
	}
	
	public static void division(double num1, double num2) {
		double div;
		if(num1>num2) {
			div=num1/num2;
			System.out.println(div);
		}
		else {
			System.out.println("We can't devide " + num1 +  " with " + num2);
		}
		
	}
	
	public static void multiplication1(double num1, double num2) {
		double mul;
		mul=num1*num2;
		System.out.println(mul);
		
	}
	 
	public static void main(String[] arg) {
		System.out.println("Enter first number");
		Scanner sc1 = new Scanner(System.in);
		double num1 = sc1.nextDouble();
		
		System.out.println("Enter second number");
		Scanner sc2 = new Scanner(System.in);
		double num2 = sc2.nextDouble();
		
		addNumbers(num1,num2);
		substractNumbers(num1, num2);
		division(num1,num2);//1/2
		multiplication1(num1,num2);
		
	}

}

