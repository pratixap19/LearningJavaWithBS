package Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//no order
//no indexing
//stores value key value<k, v>
//key can't be duplicate
//can store n number of values but only one null key
//if two null keys are used then it gives latest value
public class HashMapBasics {

	public static void main(String[] args) {
		
		HashMap<String, String> capitaltMap = new HashMap<String, String>();
		
		capitaltMap.put("India", "Delhi");
		capitaltMap.put("USA", "DC");
		capitaltMap.put("UK", "London");
		capitaltMap.put("UK", "London11");
		capitaltMap.put("null", "Berlin");
		capitaltMap.put("null", "LA");
		capitaltMap.put("Russia", "null");
		capitaltMap.put("France", "null");
		
		System.out.println(capitaltMap.get("USA"));
		System.out.println(capitaltMap.get("UK"));
		System.out.println(capitaltMap.get("null"));
		System.out.println(capitaltMap.get("France"));
		
		System.out.println("*****************");
		//How to iterate HashMap
		//1. iterator over the keys by using keySet()
		Iterator<String> it = capitaltMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = capitaltMap.get(key);
			System.out.println("key = " + key+ " " + "and "  + "value = " + value);
		}
		
		System.out.println("*****************");
		//2. iterator over the set(pair) by using entrySet()
		 Iterator<Entry<String, String>> it1 = capitaltMap.entrySet().iterator();
		
		 while(it1.hasNext()) {
			  Entry<String, String> entry = it1.next();
			  System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
		 }
		 System.out.println("*****************");
		 
		 //3.iterator over the set(pair) by using for each loop and entrySet()
		 
		 for(Map.Entry m :capitaltMap.entrySet()) {//Entry is sub interface of Map
			 System.out.println("key = " + m.getKey() + " and value = "  + m.getValue());
		 }
	}

}
