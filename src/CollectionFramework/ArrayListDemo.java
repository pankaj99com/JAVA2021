package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * 1/Duplicates are allowed 
		 * 2/Insertion order is maintained 
		 * 3/Frequently used methods-
		 * 1)add() 
		 * 2)get() 
		 * 3)addAll() 
		 * 4)size() 
		 * 5)remove()
		 * 
		 */
		List<Object> arr = new ArrayList<Object>();//SuperInterface is Iterable(GP) and Collection
		//List l=new List(); Cannot Instantiate Interface so it the duty of the ArrayList,LinkedList and Stack to implement all the methods of LIst interface
		//That is the reason all the methods are common in List Interface implementing classes.
		
		arr.add(100);
		
		arr.add(20);//duplicates are allowed inside list
		arr.add(20);
		arr.add(3);
		arr.add("pankaj");
		arr.add('A');
		arr.add('p');
		arr.set(3,"INDIA");//On

		List<Object> arr2 = new ArrayList<Object>(arr);
		System.out.println(arr2);

		System.out.println(arr);//insertion order is maintained if we print the arraylist
		System.out.println(arr.get(3));//gives the list item at particular index
		//n+n/2+1==10+6=16
	
		System.out.println(arr.size());//gives the size of the list
		arr.add(true);//since my list is of type object any data types can be added 
		arr.add(2, "Test");//I can also add list items at particular index and internally shifting will happen
		System.out.println(arr);

		ArrayList<Object> arr1 = new ArrayList<Object>();
		arr1.add(123);
		arr1.add("selenium");
		arr1.add('A');
		arr.addAll(arr1);
		System.out.println(arr);
		arr.addAll(2,arr1);
		arr.contains('p');
		System.out.println(arr.contains('p'));
		System.out.println(arr.containsAll(arr1));

		// arr.clone();
		// arr.clear();
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(4));// Array index out of bound exception
		// System.out.println(arr.get(-1));//Negative indexing is not allowed

		// Removing elements from arraylist

		// arr1.remove(1);
		// System.out.println(arr1);
		arr1.remove(String.valueOf("selenium"));
		//arr1.remove(0);
		
		System.out.println(arr1);
		arr1.set(0, "Pankajkumar");
		System.out.println(arr1);
		

		// 3 ways to print the List
		System.out.println("1.using for loop to print arraylist");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("the element in arr at index " + i + " is :--->" + arr.get(i));
		}

		System.out.println("2.using for loopeach to print arraylist");
		for (Object element : arr) {
			System.out.println("the element in arr is:" + element);
		}
		
		for (Object x : arr1) {
			System.out.println("the element in arr is:" + x);
		}
		

		System.out.println("3.using Iterator print arraylist");
		Iterator<Object> it = arr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
