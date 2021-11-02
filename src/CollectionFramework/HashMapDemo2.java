package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(10,"Java1");
		map1.put(15, "Selenium1");
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		//4 constructors
		//Map<Integer,String> map=new HashMap<Integer,String>();//default 
		//Map<Integer,String> map=new HashMap<Integer,String>(map1);//accepts map
		//Map<Integer,String> map=new HashMap<Integer,String>(10);//customized initial capacity
		//Map<Integer,String> map=new HashMap<Integer,String>(10,12.98f);//customized initial capacity and fill ratio
		
		map.put(100,"Java");
		map.put(101, "Selenium");
		map.put(106, "C++");
		map.put(1, "Python");
		map.put(111, "Ruby");
		map.put(112, "javaScript");
		
		
		System.out.println(map);
		
		
		System.out.println("**********BOOLEAN METHODS********");
		System.out.println(map.containsValue("Java"));//boolean
		System.out.println(map.containsKey(1));//boolean
		System.out.println(map.equals(map));//boolean
		System.out.println(map.isEmpty());//boolean
		
		System.out.println("**********Retrival METHODS********");
		System.out.println(map.get(1));//python
		System.out.println(map.hashCode());//-1355007399
		System.out.println(map.values());//[javaScript, Python, Java, Selenium, C++, Ruby]
		
		System.out.println(map.keySet());//[112, 1, 100, 101, 106, 111]
		System.out.println(map.entrySet());//[112=javaScript, 1=Python, 100=Java, 101=Selenium, 106=C++, 111=Ruby]
		map.putIfAbsent(2, "NodeJS");
		System.out.println(map.entrySet());//[112=javaScript, 1=Python, 2=NodeJS, 100=Java, 101=Selenium, 106=C++, 111=Ruby]
		System.out.println(map.remove(2));//removing and printing nodejs
		System.out.println(map);//{112=javaScript, 1=Python, 100=Java, 101=Selenium, 106=C++, 111=Ruby}
		System.out.println(map.replace(1, "QTP"));
		System.out.println(map.entrySet());
		System.out.println(map.size());
		
		//map.clear();
		
		
		System.out.println(map.toString());
		
		
	//if i want to read keys or value one by one then we can go for for loop
		System.out.println("*************************");
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
