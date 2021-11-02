package CollectionFramework;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MyComparator2 implements Comparator{


	
	@Override
	public int compare(Object obj1, Object obj2) {
		return ((Comparable) ((Map.Entry) (obj1)).getValue()).compareTo(((Map.Entry) (obj2)).getValue());
		
	}
}