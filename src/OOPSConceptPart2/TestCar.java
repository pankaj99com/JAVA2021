package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		//compile time or static polymorphism
		
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.threatSafety();
		b.engine();
		System.out.println("**********************");
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		//c.threatSafety(); -In java parent class object cannot access car class method
		
		Car c1=new BMW();
		/*Child class object can be referred by parent class 
		reference variable is call dynamic or run time polymorphism*/
		//This is called topcasting
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.threatSafety(); only parent method can be accessed by reference variable of parent class
		
		//downcasting
		//BMW b1=newCar();downcasting is not allowed
		BMW b1=(BMW)new Car();//Dowcasting is allowed but at runtime it will throw ClassCastException
		
		

	}

}
