package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Collections;

public class PrintArrayListInAssendingOrder {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(21);
		al.add(45);
		al.add(67);
		al.add(36);
		Collections.sort(al);
		System.out.println(al);
		for(Integer value:al) {
			System.out.println(value);
		}
		
		//print in descending order
		System.out.println("****************");
		for(int i=al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}

	}

}
