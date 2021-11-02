package Constructor;

public class ConstructorChaining {
	
	 ConstructorChaining(double d) {
		 this(10);
		 System.out.println("This double constructor");
		
	}
	 
	 

	 ConstructorChaining(int a) {
		 this();
		 System.out.println("This is integer constructor");
		
	}
	 
	 

	 ConstructorChaining() {
		System.out.println("No args constructor");
	}
	 
	 


	public static void main(String[] args) {
		ConstructorChaining obj=new ConstructorChaining(10.2);
//		No args constructor
//		This is integer constructor
//		This double constructor
		
		ConstructorChaining obj1=new ConstructorChaining(10);
//		No args constructor
//		This is integer constructor
		
		ConstructorChaining obj2=new ConstructorChaining();
//		No args constructor
	}

}
