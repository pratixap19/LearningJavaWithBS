package CollectionProgramsH;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(95,67,28,51,39));
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
	}

}
