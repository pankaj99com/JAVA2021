package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	
		Set<Integer> set=new LinkedHashSet<>();
		//1.Insertion order is  maintained in case of LinkedHashSet
		//2.Duplicate elements are not allowed
		
		set.add(10);//internally hashing is happening and some hash id is generated and corresponding to that hash id elements is inserted
		set.add(23);
		set.add(44);
		set.add(5);
		set.add(23);//Duplicate elements cannot be inserted inside the sets
		set.add(23);
		set.add(23);
		
		System.out.println(set);
		
		
		set.remove(23);
		System.out.println(set);
		
		System.out.println(set.contains(44));
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		

	}

}
