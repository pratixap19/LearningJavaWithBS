package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(51,56,89,34,90, 25,2,3));
		ArrayList<Integer> al3 = new ArrayList<Integer>(Arrays.asList(50,56,89,34,90,58,38));
		
		HashSet<Integer> ls1= new HashSet<Integer>(al2);
		HashSet<Integer> ls2= new HashSet<Integer>(al3);
		ls1.retainAll(ls2);
		System.out.println(ls1);
		
		ArrayList<Integer> al4 = new ArrayList<Integer>(ls1);
		System.out.println(al4);
	
	}

}
