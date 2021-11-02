package OOPSConceptPart1;

public class B extends A {
	public B() {

		super();// calling parent class constructor
		System.out.println("Child class constructor");
	}

	public B(int i) {

		super(i);// calling parent class constructor

	}

	public B(int i, int j) {

		super(i, j);// calling parent class constructor

	}
//	void test() {
//		System.out.println("test method ");  Output:Compile Time Error
//	}
	public static void main(String args[]) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);
		
	}
}
