package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>(Arrays.asList("apple", "banana","Chicoo", "watermelon", "apple", "banana" ));
		HashSet<String> set = new HashSet<String>(list);
		ArrayList<String> list1 = new ArrayList<String>(set);
		System.out.println(list1);
	}

}
