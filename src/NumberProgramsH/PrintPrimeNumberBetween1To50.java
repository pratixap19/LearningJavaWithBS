package NumberProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class PrintPrimeNumberBetween1To50 {

	public static void main(String[] args) {
		int total=0;
		for(int i=2;i<=50;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				total++;
				System.out.println(i);
			}
		}
		System.out.println("Total number of prime numbers are : " + total);
	
	}
}