package OOPSConceptPart1;

public class LocalVsGlobalVariable {
	String name="TOM";
	int age=25;
	//These are global variable or class variables

	public static void main(String[] args) {

		int i=10;//local variable for main method

		System.out.println(i);

		LocalVsGlobalVariable obj= new LocalVsGlobalVariable();

		System.out.println(obj.name);

		System.out.println(obj.age);

		obj.sum();

	}

	public void sum(){

		int i=10;//local variable for sum method

		int j=20;

		System.out.println("sum method");

	}

}
