package CollectionFramework;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	
		Set<Integer> set=new TreeSet<>();// no args constructor:--It is nothing but internally calling comparable -method:-compareTo()
		//1.Insertion order Not applicable
		//2.Duplicate elements are not allowed
		//3.Elements inserted in sorted order as behind the scene Balanced tree is implemented
		//Heterogeneous objects are not allowed
		Set<Object> set1=new TreeSet<>();
		set1.add("pankaj");
		set1.add("sandy");
		set1.add("viswa");
		set1.add("Abhi");
		//set1.add(5); it will throw run time class cast exception
		System.out.println(set1);
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
