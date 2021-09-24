package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30,90);
		obj.sum("Pankaj");
		obj.sum("pankaj", 100);
		obj.sum(10, "Pankaj");
		
		
		// obj.sum('a',10); automatic upcasting is happening here and it will
		// not throw any error.

	}

	// we can overload main method as well

	public static void main() {
		System.out.println("pankaj");

	}

	public static void main(int a, int b) {
		System.out.println(
				"JVM reponsibility to call the main method and that reason it will ignore overloaded main methods");
	}

	public void sum() {
		System.out.println("sum method with zero input paramaters");
		// sum(10,20);we can call another method from inside a method
	}

	// Method overloading-When method name is same but having different
	// arguements /or different input parameters within the same class
	// we cannot create method inside a method'
	// duplicate methods -i.e same method name with same number of argument are
	// not allowed
	public void sum(int a) {
		System.out.println("sum method with single input paramter");
	}

	public void sum(String str) {
		System.out.println("String input parameters");
	}

	public void sum(String str, int a) {
		System.out.println("String + integer input parameters");
	}

	public void sum(int a, String z) {
		System.out.println("String + integer input parameters");
	}

	public void sum(int i, int j) {
		System.out.println("sum method with double input parameters.");
	}
	
	public int sum(int a,int b,int c) {
		
		int sum=a+b+c;
		System.out.println("Sum of 3 number is :"+sum);
		return sum;
		
	}
}
