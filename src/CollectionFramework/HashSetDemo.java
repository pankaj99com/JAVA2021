package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
	
		Set<Integer> set=new HashSet<>(); //default size =16 and default  fill ratio 75%
		
		//Set<Integer> s1=new Set<>(); Cannot instantiate Interface Set so implementing class for Set is HashSet,LinkedHashSet,TreeSet
		
		//1.Insertion order is not maintained
		//2.Duplicate elements are not allowed
		
		set.add(10);//internally hashing is happening and some hash id is generated and corresponding to that hash id elements is inserted
		set.add(23);
		set.add(44);
		set.add(5);
		set.add(23);//Duplicate elements cannot be inserted inside the sets
		set.add(23);
		set.add(23);
		System.out.println(set.hashCode());
		
		System.out.println(set);
		
		
		set.remove(23);
		System.out.println(set);
		
		System.out.println(set.contains(44));
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		//set.clear();
		//System.out.println(set);
		for (Integer i : set) {
			System.out.println(i);
			
		}
		System.out.println("using Iterator print set");
		Iterator it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
