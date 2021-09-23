package Practice;

import java.util.Arrays;

public class SortStringCharacters {

	public static void main(String[] args) {
		String str = "java";

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;

				}
			}
		}
		System.out.println(new String(ch));
		
		
		//2.Approach
		String str1="Pankaj";
		String newString=str1.toUpperCase();
		char[] ch1=newString.toCharArray();
		Arrays.sort(ch1);
		System.out.println(new String(ch1));
	}

}
