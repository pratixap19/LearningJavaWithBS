package NumberPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	//1st approach using third variable
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter first num");
		int num1 = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter second num");
		int num2 = sc2.nextInt();
		
		System.out.println("Before swaping :" + num1 + " " + num2);
		
		/*int temp;
		temp=num1;
		num1=num2;
		num2=temp;*/
		
		//System.out.println("After swaping :" + num1 + " " + num2);
		
		//2nd approach without using third variable
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swaping :" + num1 + " " + num2);

	}

}
