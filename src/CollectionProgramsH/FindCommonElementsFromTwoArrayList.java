package CollectionProgramsH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindCommonElementsFromTwoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(51,56,89,34,90, 25,2,3));
		ArrayList<Integer> al3 = new ArrayList<Integer>(Arrays.asList(50,56,89,34,90,58,38));
		al2.addAll(al3);
		System.out.println(al2);
		System.out.println("************************");
		HashSet<Integer> ls1= new HashSet<Integer>(al2);
		HashSet<Integer> ls2= new HashSet<Integer>(al3);
		ls1.retainAll(ls2);
		System.out.println(ls1);
		
		System.out.println("************************");
		
		ArrayList<Integer> al = new ArrayList<Integer>(ls1);
		ArrayList<Integer> al1=new ArrayList<Integer>(ls2);
		al.addAll(al1);
		for(Integer element:al) {
			System.out.println(element);
		}
		
		System.out.println("************************");
		
		HashSet<Integer> hs= new HashSet<Integer>(al);
		ArrayList<Integer> al4 = new ArrayList<Integer>(hs);
		System.out.println(al4);
		
	}

}
