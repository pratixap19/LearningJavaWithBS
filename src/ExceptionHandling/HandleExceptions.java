package ExceptionHandling;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		System.out.println("Program is started");
		//Example 1
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		try {
		   System.out.println(100/num);
		}
		catch(ArithmeticException e){
			System.out.println("Invalid data");
		}
		System.out.println("Program is completed");
		System.out.println("Program is excited");*/
		
		System.out.println("*****************************");
		//Example 2
		/*String s=null;
		try {
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program is completed");*/
		
		//Example 3
		/*int a[]=new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position(0-4):");
		int pos = sc.nextInt();
		
		System.out.println("Enter a value:");
		int value=sc.nextInt();
		try {
			a[pos]=value;//ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
			e.getMessage();
		}
		
		//System.out.println(a[pos]);*/
		
		//Example 4
		String s="welcome";
		try {
			int num= Integer.parseInt(s);//NumberFormatException
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println("Exception handled");
			e.getMessage();
		}
		System.out.println("Program executed");
		
	}

}
