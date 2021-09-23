package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> numbers=new TreeMap<>();
		//1.Keys will be unique values can be same
		//2.Keys will be in sorted order in case of TreeMap(Sorting the alaphabets)
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		//numbers.put("Two", 5);//New values will be updated
//		
//		if(!numbers.containsKey("Two")){
//			numbers.put("Two", 5);
//		}
		
		
		//or
		
		
		numbers.putIfAbsent("Two", 5);
		
		System.out.println(numbers);
		
		for(Map.Entry<String, Integer> e:numbers.entrySet()){
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
        for(String key:numbers.keySet()){
        	System.out.println(key);
        	
        }
        
        for(Integer val:numbers.values()){
        	
        	System.out.println(val);
        	
        }
        
       System.out.println(numbers.containsValue(4));
       
       System.out.println(numbers.isEmpty());
       
       numbers.remove("Three");
       System.out.println(numbers);
      numbers.clear();
      System.out.println(numbers);
        
        
	}

}
