package Practice;

public class RemovingSpecialCharfromString {

	public static void main(String[] args) {
	String str="Pa@*&(#nkaj$";
	
	//1.Approach 1
	String plainStr=str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(plainStr);
	
	

	}

}
