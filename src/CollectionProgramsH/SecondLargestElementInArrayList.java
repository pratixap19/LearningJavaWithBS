package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargestElementInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(34,56,1,2,7,9,23));
		Collections.sort(al);
		//Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		System.out.println(al.get(5));
		}

}
