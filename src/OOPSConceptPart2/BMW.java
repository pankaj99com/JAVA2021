package OOPSConceptPart2;

public class BMW extends Car {//has-a relationship
	/*Method overriding-when same method is present in parent class as well in child 
	with same name and same number of arguement is called method overriding*/
	
//	This static method cannot hide the instance method from Car:Static method cannot be overridden
	public  void start(){
		System.out.println("BMW start method");
	}
	
	
	public void threatSafety(){
		System.out.println("BMW Threat safety method");
	}
	

}
