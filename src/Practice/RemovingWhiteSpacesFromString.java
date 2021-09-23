package Practice;

public class RemovingWhiteSpacesFromString {

	public static void main(String[] args) {
		String str="P    a       n     k     a    j";
		String str2=str.replaceAll(" ", "");// unicode value of space is \\s and we are trying to replace space with empty
		System.out.println(str2);
		String str1=str.replaceAll("\\s", "");// unicode value of space is \\s and we are trying to replace space with empty
		System.out.println("Before removing whitespaces:"+str);
		System.out.println("After removing white space"+str1);
		
		}
	}


