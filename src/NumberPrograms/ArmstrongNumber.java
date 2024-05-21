package NumberPrograms;
//follow telusko
//ex of armstrong number is 1,2,3,4,5,6,7,8,9,153,370,371,407,1634, 8208,9474
//ex of armstrong numbers are 0,1,153,370,371,407
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//153 = 1*1*1+5*5*5+3*3*3=153
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int temp=num;
		int rem, sum=0;
		while(num>0) {
			rem=num%10;
			sum = sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("It is an armstrong num");
		}
		else {
			System.out.println("It is an armstrong num");
		}
	}

}
