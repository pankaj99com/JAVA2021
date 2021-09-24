package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		//compile time or static polymorphism
		
		
		
		//1.child class ref and child class object
		BMW b=new BMW();
		b.start();//child class method will be callled during runtime
		b.stop();//parent class stop method
		b.refuel();//parent Car class method
		b.threatSafety();//own method
		b.engine();//grant parent method
		System.out.println("**********************");
		
		
		
		//2.parent class ref and parent class object
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		//c.threatSafety(); -In java parent class object cannot access child class method
		
		
		
		//3. parent class ref and child class object
		Car c1=new BMW();
		/*Child class object can be referred by parent class 
		reference variable is call dynamic or run time polymorphism*/
		//This is called topcasting
		c1.start();//child class method wiill be called.
		c1.stop();
		c1.refuel();
		c1.engine();
		//c1.threatSafety(); only parent method can be accessed by reference variable of parent class
		
		//downcasting
		
		
		//BMW b1=newCar();downcasting is not allowed
		
		//4.child class ref and parent class object-NOT ALLOWED 
		//when trying to Downcast the parent object to child class object then we get class cast exception
		
		
		BMW b1=(BMW)new Car();//Dowcasting is allowed but at runtime it will throw ClassCastException
		System.out.println("TEST");
		

	}

}
