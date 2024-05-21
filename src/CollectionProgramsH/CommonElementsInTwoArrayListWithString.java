package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementsInTwoArrayListWithString {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Pineapple", "Strawberry"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Apple", "Blueberry", "Pear", "Strawberry"));
		
		list1.retainAll(list2);
		System.out.println(list1);
	}

}
