package CollectionProgramsH;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Apple");
		map.put(2, "Mango");
		map.put(null, "Papaya");
		map.put(null, "Orange");
		map.put(1, null);
		map.put(6, "Banana");
		
		for(Entry<Integer, String> x:map.entrySet()) {
			System.out.println("Get key: " + x.getKey() + " " + "Get value: " + x.getValue());
		}
		
		 String key1 = map.get(null);
		 System.out.println(key1);
	}

}
