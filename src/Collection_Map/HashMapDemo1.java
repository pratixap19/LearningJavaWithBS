package Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo1 {
	/*followed Bipin's video
	 * What is HashMap?
	 *HashMap is a class in Java which impliments Map interface.
	 *It stores data in the form of key and value pair.
	 *Multiple entry set is called as entry set.
	 *
	 *Rules:
	 *1. It allows duplicate values 
	 *1. it allows unique key. If you try to add another key it will work as updating the element.
	 *3. It allows to sore multiple null values.
	 *4. It allows only one null key.
	 *no order
	 *no indexing
	 *stores value key value<k, v>
     *key can't be duplicate
     *can store n number of values but only one null key
     *if two null keys are used then it gives latest value
	 * 
	 * */
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Rahul");
		map.put(2, "Sandeep");
		map.put(3, "Sandeep");
		map.put(2, "Rohin");//it allows unique key. If you try to add another key it will work as updating the element.
		map.put(4, null);
		map.put(null, null);
		
		System.out.println(map);
		
		System.out.println("Size of HashMap:" + map.size());
		
		map.putIfAbsent(1, "Ayan");
		System.out.println(map);
		
		System.out.println(map.containsKey(4));
		
		//map.clear();
		
		//get all the keys from HashMap
		System.out.println(map.keySet()); // [null, 1, 2, 3, 4]
		
		//get all the values from HashMap
		System.out.println(map.values()); // [null, Rahul, Rohin, Sandeep, null]
		
		//get keys along with values
		System.out.println(map.entrySet());
		
		System.out.println("**********************");
		
		//to get all entry set
		for(Entry<Integer, String> e:map.entrySet()) {
			//System.out.println(e.getKey() + " "  + e.getValue());
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		System.out.println("***************");
		
		//reading data from HashMap.Normal for loop is not possible bcz it doesn't follow indexing
		
		//using for each loop
//		for(int k :map.keySet()) {
//			System.out.println(k + " " + map.get(k));
//		}
		
		System.out.println("***************");
				
		//using iterator
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
				Entry<Integer, String> entry = it.next();
				System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("***************");
				
		//clear everything
		//hm.clear();
		System.out.println(map.isEmpty());//true
		
		
		

	}

}
