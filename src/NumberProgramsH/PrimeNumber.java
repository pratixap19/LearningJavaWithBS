package NumberProgramsH;

import java.util.Scanner;
//if num =5 then we need to check if it is devisible by 2,3 and 4 so we need to 
//run for loop from 2 to num-1
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();//5 1 and 5
		boolean isPrime=true;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0) {
				isPrime=false;
				break;
			}	
		}
		if(isPrime) {//here isPrime=true as we assign value at the beginning
			System.out.println("Is a prime number");
		}
		else {
			System.out.println("Is not a prime number");
		}
		

	}

}
