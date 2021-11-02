package JavaPrograms2021;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String str=" Pank@!)(^&a~+_)&?><J!";
		
		//Anything other than alphabets and numbers are special characters
		//same can be written as :[^a-zA-Z0-9]
		
		str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
