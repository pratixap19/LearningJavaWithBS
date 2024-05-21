package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertStringToList {

	public static void main(String[] args) {
		String s="selenium";
		
		//conversion from string to array
		char[] ch= s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		//conversion from array to list
		ArrayList<Character> list = new ArrayList<Character>();
		for(char x:ch) {
			list.add(x);
		}
		System.out.println(list);

	}

}
