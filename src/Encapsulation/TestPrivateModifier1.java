package Encapsulation;

public class TestPrivateModifier1 {

	public static void main(String[] args) {
		// creating instance of the encapsulated class
		PrivateModifier1 s = new PrivateModifier1();
		// setting value in the name member
		s.setName("vijay");
		// getting value of the name member
		System.out.println(s.getName());
	}
}
