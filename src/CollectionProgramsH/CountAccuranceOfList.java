package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountAccuranceOfList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Apple","Apple", "Strawberry", "Banana", "Banana", "Pineapple", "Strawberry"));
		HashMap<String, Integer> occurance = new HashMap<String, Integer>();
		for(String x:list) {
			occurance.put(x, occurance.getOrDefault(x, 0)+1);
		}
		
		System.out.println(occurance);
	}

}
