package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(100,"Java");
		map.put(101, "Selenium");
		map.put(106, "C++");
		map.put(1, "Python");
		map.put(111, "Ruby");
		map.put(112, "javaScript");
		
		
		System.out.println(map);
		
		System.out.println(map.containsValue("Java"));
		System.out.println(map.equals(map));
		System.out.println(map.get(1));
		System.out.println(map.hashCode());
		System.out.println(map.values());
		System.out.println(map.containsKey(1));
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		map.putIfAbsent(2, "NodeJS");
		System.out.println(map.entrySet());
		System.out.println(map.remove(2));//removing and printing 
		System.out.println(map);
		System.out.println(map.replace(1, "QTP"));
		System.out.println(map.entrySet());
		System.out.println(map.isEmpty());
		//map.clear();
		System.out.println(map.entrySet());
		
		System.out.println(map.toString());
		
		
	//if i want to read keys or value one by one then we can go for for loop
		
		for(Object i:map.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("*************************");
		for(Object i:map.values()) {
			System.out.println(i);
		}
		System.out.println("*************************");
		for(Object i:map.entrySet()) {
			System.out.println(i);
		}
		
		System.out.println("*************************");
		for(Object i:map.keySet()) {
			System.out.println(i+" = "+map.get(i));
			
		}
		
		System.out.println("*********Entry methods****************");
		//Entry methods
	for(Map.Entry entry :map.entrySet()) {
		
		System.out.println(entry.getKey()+" = "+entry.getValue());
	}

	}

}
