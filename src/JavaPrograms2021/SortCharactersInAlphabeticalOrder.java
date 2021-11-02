package JavaPrograms2021;

import java.util.Arrays;

public class SortCharactersInAlphabeticalOrder {

	public static void main(String[] args) {
		String str = "pankaj";

		char[] arr = str.toCharArray();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr);
		System.out.println(new String(arr));
		
		//Approach2:using collection
		
		String str1="india";
		char[] a=str1.toCharArray();
		Arrays.sort(a);
		System.out.println(a);
		System.out.println(new String(a));
	}

}
