package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {

	public static void main(String[] args) {
		String[] s = {"Round", "square","triangle","rectangle"};
		System.out.println(Arrays.toString(s));
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(s));
		System.out.println(list);
	}
}
