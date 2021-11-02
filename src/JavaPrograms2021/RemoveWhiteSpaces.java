package JavaPrograms2021;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
	String str="    India   is   a     great   country   ";
	System.out.println(str.trim());//This will only remove the white spaces from the beginning and end of the string
	
	System.out.println(str.replaceAll("\\s", ""));
	//or
	System.out.println(str.replaceAll(" ", ""));

	}

}
