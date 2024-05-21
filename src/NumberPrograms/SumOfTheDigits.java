package NumberPrograms;

import java.util.Scanner;

public class SumOfTheDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		sc.close();
		int sum=0;
		int rem;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;//2
			num=num/10;
		}
		System.out.println(sum);

	}

}
