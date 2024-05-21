package Collection_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	/*
	 * What is HashSet?
	 * HashSet is a class in Java which implements Set interface.
	 * HashSet class is used to create a collection that uses a hash table for storage.
	 * HashSet stores elements by using a mechanism called hashing.
	 * 
	 * Rules:
	 * 1. Insertion order is not maintained
	 * 2. Duplicate elements are not allowed.
	 * 3. Indexing is not maintained so getter and setter are not available.
	 * 4. Only one null value is allowed.
	 * 5. HashSet is the best approach for search operations.
	 * 6. The initial default capacity of HashSet is 16 and load factor is 0.75.
	 * 7. Inserting element is not possible
	 * 8. retriving/accessing specific element is not possible
	 * 
	 * Question:
	 * When should we go for AL, LL and HS?
	 * whenever you don't want to store duplicate values then go for HS.
	 * HashSet is the best approach for search operations.
	 * For accessing the data go for AL.
	 * For manupulating data go for LL.
	 * 
	 * */
	public static void main(String[] args) {
		//HashSet set = new HashSet();//to store hetrogenious data
		//Set myset = new HashSet();//to store hetrogenious data
		//HashSet<String> myset = new HashSet<String>();//to store homogenious data
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(11);
		set.add(11);
		set.add(34);
		set.add(null);
		set.add(null);
		
		//printing hashSet
		System.out.println(set);
		
		//There is another way to access elements from HashSet.Convert HashSet to ArrayList.
		ArrayList al = new ArrayList(set);
		System.out.println(al);
		
		System.out.println("Size of HashSet: " + set.size());
		
		//set.clear();
		//System.out.println(set);
		
		System.out.println(set.contains(11));
		set.remove(34);
		System.out.println(set);
		
		System.out.println(set.isEmpty());
		
		System.out.println("***********************");
		
		//read all the elements using for each loop
		for(Object element:set) {
			System.out.println(element);
		}
				
		System.out.println("***********************");
				
		//read all the elements by sing iterator 
		Iterator it = set.iterator();
			while(it.hasNext()) {
			System.out.println(it.next());
		}
				
	}

}
