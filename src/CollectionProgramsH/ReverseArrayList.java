package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(46,32,78,84,96));
		//Collections.reverse(list);
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
		
	}

}
