package OOPSConceptPart1;

public class Car {// class is just a template
	// application form available for everybody is example of class
	// fill your form with other details then it will be your copy

	// Class variable
	static String colour = "Red";// Access using class.variablename as it os
									// present in common place free of cost to
									// everyone so no need to create object of
									// the class in order to access the static
									// variables
	int model;
	static int wheels=4;

	public static void main(String... pankaj) {

		// public->to call by jvm from anywhere
		// static--> without any object also jvm has to call this method
		// void-->main method cannot return anything to JVM
		// main--> name of the method which is configured inside jvm by java
		// people
		// String[] args--. This is the command line argument
		// we can change the order of the modifier

		// In case of inheritance --InherITANCE CONCEPT is applicable for static
		// methods including main() also
		// hence if the child class doen't contain main() then parent class
		// main() will be executed while executing child class.

		// new Car()--This is object of the Car class.
		// a,b,c --reference variables.
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		Car d = new Car();
		Car e = new Car();// heap memory and reference variable is present in
							// stack memory and will be pointing to object.

		System.out.println(e);
		a.model = 2021;
	int wheel1=Car.wheels;

		b.model = 2020;
		int wheel2=Car.wheels;


		c.model = 2019;
		int wheel3=Car.wheels;


		e.model = 2025;
		String col = Car.colour;

		System.out.println("Before assigning the references");
		// System--class presnt in java.lang
		// out --static variable of type printstream(public static final
		// java.io.PrintStream out;)
		// println()--method present in printstream class(public void
		// println();)

		System.out.println(a.model);
		System.out.println(wheel1);
		System.out.println(b.model);
		System.out.println(wheel2);
		System.out.println(c.model);
		System.out.println(wheel3);
		System.out.println("After assigning the references");

		a = b;
		System.out.println(a.model);// 2020
		System.out.println(b.model);// 2020

		b = c;
		System.out.println(b.model);// 2019
		System.out.println(c.model);// 2019

		c = a;
		System.out.println(c.model);// 2020
		System.out.println(a.model);// 2020

		a.model = 10;
		System.out.println(a.model);// 10
		c.model = 20;
		System.out.println(a.model);// 20
		System.out.println(c.model);// 20
		String s = Car.colour;
		System.out.println(s);
		
		
		
}
}
