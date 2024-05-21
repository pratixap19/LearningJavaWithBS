package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(20,45,67,20,45,60,34,45, 67));
		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>(al);
		ArrayList<Integer> al3 = new ArrayList<Integer>(ls);
		System.out.println(al3);

	}

}
