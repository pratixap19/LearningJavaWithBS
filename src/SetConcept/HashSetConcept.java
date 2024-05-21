package SetConcept;
//followed Naveen Automation

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		//Set<String> hs = new HashSet<String>();
		hs.add("alpha");
		hs.add("Testing");
		hs.add("Beta");
		hs.add(null);
		hs.add("Beta");
		hs.add("alpha");
		
		System.out.println(hs);
		
		System.out.println("*********************");
		
		for(String e : hs) {
			System.out.println(e);
		}
		
		System.out.println("*********************");
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("*********************");
		hs.remove("Beta");
		System.out.println(hs);
		
		System.out.println("*********************");
		//mathematical operations performed on Set
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,3,4,5,6,8,9,10}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,2,3,5,6,7,9}));
		
		System.out.println("***********************");
		first.addAll(second);
		System.out.println(first);
		System.out.println("***********************");
		
		//get the union
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		System.out.println("*********************");
		
		//get the intersection/common value
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		
		System.out.println("*********************");
		
		//get the difference
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);
		
	}

}
