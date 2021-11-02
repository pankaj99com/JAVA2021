package ConstructorDemo;

public class B extends A{
	
	public B() {
		super();
		System.out.println("ChILD class constructor");
		
	}
	
	public B(int i) {
		super(i);
	
	}
	public B(int i,int j) {
		super(i,j);
	
	}
	public static void main(String[] args) {
		
		B obj= new B();
		
		B obj1=new B(20);
		
		B obj2=new B(10,30);
		
		

		

	}

}
