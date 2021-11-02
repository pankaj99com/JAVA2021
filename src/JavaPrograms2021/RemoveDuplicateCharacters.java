package JavaPrograms2021;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String str = "Programminng";

		// Approach1: Using indexOf()

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			int idx = str.indexOf(ch, i + 1);

			if (idx == -1) {// if not same ten add into string builder ref

				sb.append(ch);
			}
		}
		System.out.println(sb);

		// Approach2:str.toCharArray();

		char[] charray = str.toCharArray();

		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < charray.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < charray.length; j++) {
				if (charray[i] == charray[j]) {
					repeated = true;
					break;
					}
				}
			if (!repeated) {
				sb1.append(charray[i]);
			}

		}
		System.out.println(sb1);
		
		//Approach3:Using set
		StringBuilder sb2 = new StringBuilder();
		Set<Character> set=new HashSet();
		
		for(int i=0;i<str.length();i++) {
			
			set.add(str.charAt(i));
		}
		
		for(Character ch1:set) {
			sb2.append(ch1);
		}
		System.out.println(sb2);
	}
	

}
