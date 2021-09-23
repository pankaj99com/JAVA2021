package OOPSConceptPart1;

public class StaticAndNonstaticConcept {
	String name="pankaj";//non static global variable
	static int age=25;//static global variable
	public static void main(String[] args) {

		// How to call static methods and variables
		//direct

		sum();//direct calling
		StaticAndNonstaticConcept.sum();//calling by classname

		// calling static variables

		System.out.println(age);//direct
		System.out.println(StaticAndNonstaticConcept.age);//calling by classname

		// how to call non static variables and method

		// we have to create object of the class
		//Once object is created then all non static variables will be given to the object.

		StaticAndNonstaticConcept obj=new StaticAndNonstaticConcept();
		System.out.println(obj.name);
		obj.senmail();
		// Can we access the static methods by using object reference
		//yes we can access but warning will given that The static method sum() from the type StaticAndNonstaticConcept should be accessed in a static way

		obj.sum();

	}
	public void senmail(){//non static method
		System.out.println("sendmail method");
	}

	public static void sum(){//static method
		System.out.println("sum method");
	}

}

