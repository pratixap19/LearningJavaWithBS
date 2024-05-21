package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallestElementInList {

	public static void main(String[] args) {
		//created arrayList and added value in the list
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3,6,9,2,5,10));
		//sorting the list and same list reverseing
		Collections.sort(list);
		System.out.println("After sorted list:" + list);
		Collections.reverse(list);
		System.out.println("After reversing list:" + list);
		//fatching values based on index
		System.out.println(list.get(4));
		//System.out.println(list.size()-2); - not working
		}
}
