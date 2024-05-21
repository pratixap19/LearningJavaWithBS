package Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics1 {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		map.put("Boston", 20);
		map.put("Austin", 30);
		map.put("Scranton",18);
		map.put("New Jercy", 24);
		
		System.out.println(map);
		
		for(Entry<String, Integer> x:map.entrySet()) {
			System.out.println("City:" + x.getKey()+" "+"Temprature:" + x.getValue());
		}
		
		System.out.println("***********************");
		Integer value = map.get("Scranton");
		System.out.println(value);
		
		System.out.println("***********************");
		System.out.println("Keys:" + map.keySet());
		System.out.println("Values:" + map.values());
		System.out.println("Keys and values are:" + map.entrySet());
		System.out.println("***********************");
		
		map.replace("New Jercy",25);
		System.out.println(map);
		
		System.out.println("***********************");
		//map.remove("New Jercy");
		//System.out.println(map);
		
		for(Entry<String, Integer> x:map.entrySet()) {
			System.out.println(x.getKey()+ " "+ x.getValue());
		}
		
		System.out.println("***********************");
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			int value1 = map.get(key);
			System.out.println(key +" "+ value1);
		}
		
		System.out.println("***********************");
		Iterator<Entry<String, Integer>> it1 = map.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, Integer> entry = it1.next();
			System.out.println(entry.getKey() +" " +entry.getValue() );
		}
	}

}
