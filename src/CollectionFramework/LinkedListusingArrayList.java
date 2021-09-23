package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListusingArrayList {
//All methods of Array list implementation will be applicable in Linked List
	public static void main(String[] args) {
		List<Object> arr = new LinkedList<Object>();
		arr.add(100);
		arr.add(20);
		arr.add(20);
		arr.add("pankaj");
		arr.add('A');
		arr.add('p');

		System.out.println(arr);
		System.out.println(arr.get(3));
		System.out.println(arr.size());
		arr.add(true);
		arr.add(2, "Test");
		System.out.println(arr);

		ArrayList<Object> arr1 = new ArrayList<Object>();
		arr1.add(123);
		arr1.add("selenium");
		arr1.add('A');
		arr.addAll(arr1);
		System.out.println(arr);
		arr.contains('p');
		System.out.println(arr.contains('p'));
		System.out.println(arr.containsAll(arr));

		//arr.clone();
		// arr.clear();
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(4));// Array index out of bound exception
		// System.out.println(arr.get(-1));//Negative indexing is not allowed

		// Removing elements from arraylist

		// arr1.remove(1);
		// System.out.println(arr1);
		arr1.remove(String.valueOf("selenium"));
		System.out.println(arr1);
		arr1.set(0, "Pankajkumar");
		System.out.println(arr1);
		System.out.println("using for loop to print arraylist");
		for(int i=0;i<arr.size();i++){
			System.out.println("the element in arr at index " + i +" is :--->"+arr.get(i));
		}
		System.out.println("using for loopeach to print arraylist");
		for(Object element:arr){
			System.out.println("the element in arr is:"+element);
		}
		System.out.println("using Iterator print arraylist");
		Iterator it=arr.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
