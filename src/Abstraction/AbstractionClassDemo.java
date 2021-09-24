package Abstraction;

public class AbstractionClassDemo {

	public static void main(String[] args) {
	//Car c=new Car();//we cannot create object this class but we can create object of child classes
		Audi a=new Audi();
		a.price=20000;
		a.name="Audi";
		System.out.println("Price of "+ a.name + " is " +a.price);
		a.start();
		a.stop();
		a.refill();//child can also access non abstract methods also.
		

	}

}
 class Audi extends Car{
String name;
	@Override
	void start() {
		System.out.println("AUDI is starting");
		
	}
	@Override
	void stop() {
		System.out.println("AUDI is stopping");

		
	}
	 
 }
 
 abstract class BMW extends Car{
	// BMW b=new BMW();//we cannot create object this class but we can create object of child classes
	 
 }


abstract class Car{//we cannot create object this class but we can create object of child classes
	
	int price;
	
	abstract void start();
	abstract void stop();
	Car(){
		System.out.println("This is constructor of class Car");
	}
	public void refill() {
		System.out.println("refuel method");
	}
}