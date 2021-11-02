package JavaPrograms2021;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachCharacter {

	public static void main(String[] args) {
		String str = "Hello";

		Map<Character, Integer> map = new HashMap<>();
		char[] chars = str.toCharArray();
		for (char ch : chars) {
			if (!map.containsKey(ch)) {// if the key is not presnt then add into
										// map using map.put(char,1)
				map.put(ch, 1);
			} else {
				int val = map.get(ch);// if key is presnt then it should
										// increment the value by 1 .In order to
										// implement this we should first get
										// the key index and increment the value by 1
				map.put(ch, val + 1);
			}
		}
		System.out.println(map);
	}

}
