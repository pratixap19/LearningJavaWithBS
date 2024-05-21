package CollectionProgramsH;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConvertListToSet {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("USA");
		list.add("UK");
		list.add("UAE");
		list.add("Australia");
		
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
		
		//convert set to list
		
		ArrayList<String> list1 = new ArrayList<String>(set);
		System.out.println(list1);
	}

}
