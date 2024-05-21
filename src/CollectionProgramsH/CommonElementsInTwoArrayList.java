package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommonElementsInTwoArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(23,12,43,67,49,18));
		ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(23,18,43,62,48));
		
		list1.retainAll(list2);
		System.out.println(list1);
		
		
		

	}

}
