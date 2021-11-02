package ConstructorDemo;

public class ConstructorChaining {
	
public ConstructorChaining(double d) {
		this(10);
		System.out.println("Double single param constructor");
		
	}

	public ConstructorChaining(int a) {
		
		this();
		
		System.out.println("Integer  single param constructor");
		
	}
	
	
	
	public ConstructorChaining() {
		
		System.out.println("No args constructor");
		
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorChaining obj1= new ConstructorChaining(12.5);
		ConstructorChaining obj2=new ConstructorChaining(50);
		ConstructorChaining obj3=new ConstructorChaining();
		

	}

}
