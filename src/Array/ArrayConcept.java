package Array;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr[2]);
		
		System.out.println("************************");
		
		//three ways to print array
		//1. for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("************************");
		
		//2. for each loop
		for(int num:arr) {
			System.out.println(num);
		}
		
		System.out.println("************************");
		
		//3. Arrays.toString(null)
		System.out.println(Arrays.toString(arr));
		
		System.out.println("************************");
	}

}
