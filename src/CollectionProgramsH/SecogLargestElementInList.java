package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecogLargestElementInList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3,6,9,2,5,10));
		Collections.sort(list);
		System.out.println(list);
		Integer secondLargest = list.get(list.size()-2);
		System.out.println(secondLargest);
	}

}
