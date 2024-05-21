package Array;

import java.util.Scanner;

public class TakeInputFromScannerClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int[] arr = new int[5];
		//take input using for loop
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i] + " ");
//		}
		
		for(int num:arr) {
			System.out.println(num);
		}
		

	}

}
