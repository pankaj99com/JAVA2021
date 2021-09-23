package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		
		li.add(10);
		li.add(89);
		li.add(9);
		li.add(5);
		li.add(67);
		li.add(5);
		li.add(9);
		System.out.println("minimum value--->"+Collections.min(li));
		System.out.println("maximum value---> "+Collections.max(li));
		System.out.println("Frequency of element--->"+ Collections.frequency(li, 9));
		
		Collections.sort(li);

		for(int i:li){
			System.out.println(i);
		}
	}

}
