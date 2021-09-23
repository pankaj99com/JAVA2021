package OOPSConceptPart3;

import Encapsulation.EncapsulationDemo;

public class DemoOops3 {

	public static void main(String[] args) {

		EncapsulationDemo d = new EncapsulationDemo();
		d.doWork();
		//d.doDance();// cannot access because the access modifier is defined as
					// default:he method doDance() from the type
					// EncapsulationDemo is not visible
		
		//d.drive();//cannot access beacuse the drive method can be access through the same class file
		read();
		A a=new A();
//		a.drink();
//		a.age=10;
		
	}
	private void fly(){
		System.out.println(" I am flying");
	}
	static void read(){
		System.out.println(" I am reading");
	}
	
}

class A{
	private int age;
	private void drink(){
		System.out.println(" I am drinking");
	}
}