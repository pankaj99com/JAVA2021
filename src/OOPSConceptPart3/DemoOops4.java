package OOPSConceptPart3;

import Encapsulation.EncapsulationDemo;

public class DemoOops4 {

	public static void main(String[] args) {

		EncapsulationDemo d = new EncapsulationDemo();
		d.doWork();
		//d.doDance();// cannot access because the access modifier is defined as
					// default:he method doDance() from the type
					// EncapsulationDemo is not visible
		
		//d.drive();//cannot access beacuse the drive method can be access through the same class file
		BA a=new BA();
			a.sum();
			//a.sub();
			a.mul();
			a.setPrice(2000);
			a.getPrice();
			
	}
}


class BA {
	
	private int price;
	public int getPrice() {
		System.out.println(" price is: "+price);
		return price;
	}

	public void setPrice(int price) {
		
		//boolean isAdmin=false;
		boolean  isAdmin=true;
		if(!isAdmin){
			System.out.println(" Not allowed to set price");
		}else{
			System.out.println(" Congratulations!!You are Admin now");
		System.out.println(" price set to: "+price);
		
		this.price = price;
		}
	}

	protected void sum(){
		
		System.out.println(" This is sum method");
	}
	
	private void sub(){
		System.out.println(" This is substraction");
	}
	
	void mul(){
		System.out.println(" This is multiplication method");
	}
}