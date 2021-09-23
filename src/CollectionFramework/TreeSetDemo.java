package CollectionFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	
		Set<Integer> set=new TreeSet<>();
		//1.Insertion order is  maintained
		//2.Duplicate elements are not allowed
		//3.Elements inserted in sorted order as n=behind the scene Binary tree is implements
		
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
