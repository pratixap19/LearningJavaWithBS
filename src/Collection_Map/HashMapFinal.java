package Collection_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapFinal {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		//add elements to HashMap
		map.put("Boston", 60);
		map.put("New York", 70);
		map.put("Chicago", 50);
		map.put("Los Angelus", 80);
		map.put("Austin", 100);
		map.put("Orlando", 90);
		map.put("Huston", 110);
		
		System.out.println(map);
		
		Integer value = map.get("Boston");
		System.out.println(value);
		
		map.replace("Boston", 40);
		System.out.println(map);
		
		System.out.println("Temprature of the austin is : " + map.get("Austin"));
		
		//map.remove("Huston");
		//System.out.println(map);
		
		map.remove("Huston", 110);
		System.out.println(map);
		
		System.out.println(map.containsKey("Orlando"));
		System.out.println(map.containsValue(70));
		
		System.out.println("Size of the HashMap is : " + map.size());
		
		//map.clear();
		//System.out.println(map);
		
		System.out.println("Is hasmap empty? : " + map.isEmpty());
		
		System.out.println("*****************");
		
		//How to iterate HashMap
		//1. Iterate over the keys by using keySet()
		//2. Iterate over the values by using values()
		//3. Iterate over the keys/values by using entrySet()
		//4. Regular for each loop
		
		//It will return set of keys
		System.out.println(map.keySet());
		
		System.out.println("*****************");
		
		System.out.println("Iterate over the keys by using keySet()");
		
		//1. Iterate over the keys by using keySet()
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());//It will return only key values
			//Below steps will return keys and values both 
			String key = itr.next();
			int value1 = map.get(key);
			System.out.println(key +" "+ value1);
		}
		
		System.out.println("*****************");
		
		//It will return set of values
		System.out.println(map.values());
		
		System.out.println("*****************");
		
		System.out.println("Iterate over the values by using values()");
		
		//2. Iterate over the values by using values()
		Iterator<Integer> itr1 = map.values().iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("*****************");
		
		//entrySet() will return set of keys/values
		System.out.println(map.entrySet());
		
		System.out.println("*****************");
		
		System.out.println("Iterate over the keys/values by using entrySet()");
		
		//3. Iterate over the keys/values by using entrySet()
		Iterator<Entry<String, Integer>> itr2 = map.entrySet().iterator();
		while(itr2.hasNext()) {
			Entry<String, Integer> e = itr2.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		System.out.println("*****************");
		
		System.out.println("using for each loop");
		//using for each loop
		for(Entry<String, Integer> x:map.entrySet()) {
			System.out.println("City:" + x.getKey()+" "+"Temprature:" + x.getValue());
		}
		
		System.out.println("*****************");
		
		//convert hashMap keys into ArrayList
		ArrayList<String> al = new ArrayList<String>(map.keySet());
		//System.out.println(al);
		for(String key:al) {
			System.out.println(key);
		}
		System.out.println("*********************");
		
		//convert hashMap values into ArrayList
		ArrayList<Integer> alValue = new ArrayList<>(map.values());
		//System.out.println(alValue);
		for(Integer value1:alValue) {
			System.out.println(value1);
		}
	}
}
