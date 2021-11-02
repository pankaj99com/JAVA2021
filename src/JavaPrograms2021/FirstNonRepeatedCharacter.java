package JavaPrograms2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "AABCDBE";

		for (int i = 0; i < str.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str.length(); j++) {

				if (i != j && str.charAt(i) == str.charAt(j)) {

					unique = false;

				}
			}
			if (unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}

		
		//Approach 2:using hashset
		
		Map<Character,Integer> map= new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {//check if map already contains same key
				map.put(ch, map.get(ch)+1);//if key is present we need to increment the value by 1
			}else {
				map.put(ch,1);//if key is not present then we should add it as value 1
			}
		}
		System.out.println(map);//if we print the mao then we will get key and value pair
		
		for(Entry<Character,Integer> entrySet:map.entrySet()) {//entryset will give me the value and key
			if(entrySet.getValue()==1) {//if value is 1 then we can understand that this is the non repeated character
				System.out.println(entrySet.getKey());//printing the key which is non repeated
				break;//i want first occurance so break the loop
			}
		}
	}

}
