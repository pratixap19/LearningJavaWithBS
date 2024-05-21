package Collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
//followed Naveen Automation
//How to remove duplicate elements from an ArrayList?
public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,3,2,6,4,7,8,9,7));
		System.out.println(numbers);
		
		//using LinkedHashSet
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		System.out.println(linkedHashSet);
		System.out.println("************************");
		ArrayList<Integer> numbersListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
		System.out.println("List without duplicate values---->" + numbersListWithoutDuplicates);
		
		//using JDK 8 - stream
		ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,3,2,6,4,7,8,9,7));
		List<Integer> markListUnique = markList.stream().distinct().collect(Collectors.toList());
		System.out.println(markListUnique);
	}

}
