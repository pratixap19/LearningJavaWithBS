package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CopyArrayListIntoAnotherArrayList {

	public static void main(String[] args) {
		ArrayList<String> sourceList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> destList = new ArrayList<String>(Arrays.asList("X", "Y", "Z", "L", "M"));
		System.out.println("destination list before copy:" + destList);
		Collections.copy(destList, sourceList);//To to from
		//Collections.copy(sourceList, destList); we can't write
		System.out.println("destination list after copy:" + destList);
	}
}
