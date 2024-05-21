package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumberInList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,4,5));
		int n= list.size();
		int sum=0;
		int totalSum=(n+1)*(n+2)/2;
		for(Integer value:list) {
			sum=sum+value;
		}
		int missingElement = totalSum-sum;
		System.out.println(missingElement);
	}
}
