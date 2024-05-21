package Collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	/*
	 * What is an ArrayList? It is a class in Java which implements List interface.
	 * It comes from java.utils package. It is a part of collection framework.
	 * 
	 * Why we use ArrayList? 
	 * It gives wide range of methods than array. 
	 * It is mainly use for searching, sorting and resizing etc. 
	 * Here we use only wrapper class to store the data. 
	 * we don't use primitive data type. 
	 * we can perform CRUD operations in arrayList. 
	 * ArrayList is a dynamic array.
	 * 
	 * Rules: It preserves insertion order. 
	 * It allows duplicate values. 
	 * It is index based data structure. Indexing is also maintained. 
	 * It allows random access to fetch the elements. 
	 * It can store different data types or hetrogenious data type.
	 * It can store any number of null values. 
	 * It is non synchronized. 
	 * It does not follow the sorting order. 
	 * default capacity of Arraylist is 10. 
	 * getter and setter methods.
	 * 
	 * In generic we can define primitive, non primitive and object type of data
	 * types.
	 * 
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		System.out.println(list); // 10 read operation

		list.add(20);
		System.out.println(list); // 20

		// few methods
		// extract/access element from arraylist
		System.out.println(list.get(0)); // 10 read operation

		// modification/replacement
		System.out.println(list.set(0, 45)); // updating the value
		System.out.println(list);

		System.out.println(list.remove(0)); // delete operation
		System.out.println(list);

		System.out.println(list.isEmpty());

		// list.clear();

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Rahul");
		list1.add("Virat");
		list1.add("null");
		list1.add("Rahul");
		
		System.out.println("Before sorting list1 : " + list1);
		
		Collections.sort(list1);
		System.out.println("After sorting list1 : " + list1);

		System.out.println(list1.indexOf("Rahul"));

		System.out.println(list1.lastIndexOf("Rahul"));

		System.out.println(list1.contains("Virat"));

		System.out.println(list1.size());

		// insert element in the arraylist. Insert means add element in the middle of the list.
		list1.add(2, "Sachin");
		System.out.println(list1);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("Ruby");
		al.add("C++");
		al.add(".NET");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Testing");
		a2.add("DevOps");
		
		al.addAll(a2);
		System.out.println("Elements of a1 are : " + al);
		
		for(String a:al) {
			System.out.println(a);
		}

		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add("Rohan");
		al1.add(40);
		al1.add(90);
		al1.add(50);

		System.out.println(al1);

		ArrayList al2 = new ArrayList();
		al2.add(90);
		al2.add("Rohan");
		al2.add(120);
		al2.add("Rahul");

		System.out.println(al2);

		// al1.removeAll(al2); // It will remove common elements from first list and give the values.
		System.out.println(al1);

		al1.retainAll(al2);
		System.out.println(al1); // It will return common option from both arrayList.

		// subList()
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
		System.out.println(numbers);

		// subList()
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers.subList(2, 8));
		System.out.println("sublist:" + subList);

		// to print all the values from ArrayList
		// 1. for loop
		// 2. using Iterator
		// 3. for each loop
		// 4. JDK 8 - streams with lambda

		System.out.println("Iterate elements with for loop");

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		System.out.println("*********************");
		System.out.println("Iterate elements with for each loop");

		for (String element : list1) {
			System.out.println(element);
		}

		System.out.println("*********************");
		System.out.println("Iterate elements with iterator");

		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
