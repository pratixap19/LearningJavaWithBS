package NumberPrograms;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		sc.close();
		int rev=0;
		int rem;
		int originalNum=num;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		
		if(originalNum==rev) {
			System.out.println("It is a palindrom number");
		}else {
			System.out.println("It is not a palindrom number");
		}

	}

}
