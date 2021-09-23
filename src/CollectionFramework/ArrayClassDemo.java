package CollectionFramework;

import java.util.Arrays;

public class ArrayClassDemo {
//used to work on ARRAYS AND NOT ARRAYLIST
	public static void main(String[] args) {
		
		int numbers[]={1,2,3,4,5,6,7,8};
		
	int index=Arrays.binarySearch(numbers,8);//works in case of sorted array
	
	System.out.println(index);
	int numbers1[]={56,2,33,4,5,23,7,8};
	Arrays.sort(numbers1);
	for(int i:numbers1){
		System.out.println("sortted array is :"+ i);
	}
	
		Arrays.fill(numbers, 100);
		
		for(int i:numbers){
			System.out.println("sortted array is :"+ i);
		}
		
	}

}
