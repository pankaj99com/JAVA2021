package OOPSConceptPart1;

public class StringManipulation {

	public static void main(String[] args) {
		
		String fruit="50";
		int a=77;
		System.out.println(a);
		
		
		System.out.println("*****************");
		
		String str = "India is a great countryr";
		String str1 = "INDIA is a great countryr";
		int len = str.length();
		System.out.println(len);

		char ch = str.charAt(11);
		System.out.println(ch);
		

		int index = str.indexOf('c');
		System.out.println(index);

		System.out.println(str.indexOf('r'));// first occurance of r

		System.out.println(str.indexOf('r', str.indexOf('r') + 1));// 2nd
																	// occurance
																	// of r

		int loc = (str.indexOf('r', str.indexOf('r') + 1));

		System.out.println(str.indexOf('r', loc + 1));// 3rd occurance of r

		System.out.println(str.indexOf("great"));

		// String comparison
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));

		// substring

		System.out.println(str.substring(0, 12));

		// trim
		String s = "        pankaj kumar   ";
		System.out.println(s.trim());
		// replace
		System.out.println(s.replace(" ", ""));

		String s1 = "01-09-2021";
		System.out.println(s1.replace("-", "/"));

		// split

		String s2 = "Hello_world_test_selenium";
		String s3[] = s2.split("_");
		System.out.println(s2.split("_"));
		for (int n = 0; n < s3.length; n++) {

			System.out.println(s3[n]);
		}
		// concatinate
		String s4 = "finding";
		System.out.println(s4.concat("s"));
		String str5="HELLO";
		String str6="hello";
		System.out.println(str.compareTo(str1));
		System.out.println(str6.compareTo(str5));
		System.out.println(str5.equals(str6));
		System.out.println(str5.equalsIgnoreCase(str6));
		//String example = "This is the "String" class";
		String example1 = "This is the \"String\" class";
		String example = "Hello! ";
		example.concat(example1);//Strings are immutable  in nature it means when we cannot update the value of the String
		System.out.println(example);
	}

}
