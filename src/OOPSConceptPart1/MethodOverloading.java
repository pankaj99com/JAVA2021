package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(20);
		obj.sum(20, 30);
	
	}
	
	//we can overload main method as well
	
	public static void main(){
		System.out.println("pankaj");
		
	}
	public static void main(int a,int b){
		
	}
	public void sum(){
		System.out.println("sum method with zero input paramaters");
	}
	//Method overloading-When method name is same but having different arguements /or different input parameters withi the same class
// we cannot create method inside a method'
	//duplicate methods -i.e same method name with same number  of argument are not allowed
	public void sum(int a){
		System.out.println("sum method with single input paramter");
	}

	public void sum( int i,int j){
		System.out.println("sum method with double input parameters.");
	}
}
