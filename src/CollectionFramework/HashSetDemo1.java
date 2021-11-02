package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
	
		HashSet set=new HashSet();//first constructor which has default initial capacity as 16 and fill ratio as 0.75
		
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
		
		
		System.out.println(set);
		
		
		set.remove(23);
		System.out.println(set);
		
		System.out.println(set.contains(44));
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		
		HashSet set1=new HashSet(5);//Second constructor which takes initial capacity as 5 and default fill ratio 0.75
		set1.add(8);
		set1.add(9);
		set1.add(7);
		set1.add(2);
		set1.add(3);
		set1.add(1);
		System.out.println(set1);
		
		HashSet set2=new HashSet(5,12.8f);// 3rd constructor which takes initial capacity as 5 and fill ratio 12.8
		set2.add(45);
		set2.add(43);
		set2.add(54);
		set2.add(12);
		set2.add(98);
		set2.add(94);
		System.out.println(set2);
		
		List<Integer> li =new ArrayList<Integer>();
		li.add(34);
		li.add(100);
		HashSet set3=new HashSet(li);//4th constructor which takes collection object in the parameter list
		set3.add(6754);
		System.out.println(set3);
	}

}
