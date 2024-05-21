package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	/*
	 * What is Linkedlist? It is a class that uses doubly linked list. It implements
	 * list and queue both interfaces. It acts as list and queue both. It works on
	 * node based.
	 *
	 * Whenever you want to access the data then go for ArrayList. Whenever you want
	 * to manipulate the data then go for Linkedlist.
	 */
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(24);

		System.out.println(list);

		System.out.println(list.get(1));

		list.addFirst(1234);
		System.out.println(list);

		list.addLast(2345);
		System.out.println(list);

		list.set(1, 30);
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);

		list.removeLast();
		System.out.println(list);

		list.addFirst(10);
		System.out.println(list);

		list.remove(1);
		System.out.println(list);

		// How to iterate/print all the value of LinkedList

		//for loop
		System.out.println("***Using for loop***");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		//advance for loop
		System.out.println("***Using advance for loop***");
		for (Integer str : list) {
			System.out.println(str);
		}

		//iterator
		System.out.println("***Using iterator***");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		//while loop
		System.out.println("***Using while loop***");
		int i = 0;
		while (list.size() > i) {
			System.out.println(list.get(i));
			i++;
		}

	}

}
