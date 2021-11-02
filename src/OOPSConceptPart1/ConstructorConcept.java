package OOPSConceptPart1;

public class ConstructorConcept {

	public ConstructorConcept(){
		System.out.println("Default constructor");
	}
	public ConstructorConcept(int a){
		
		System.out.println("single param constructor");//Constructor overloading
	}

	public ConstructorConcept(int a,int b){
		System.out.println("Two param constructor");
	}

	public static void main(String[] args) {
		// How to call costructor
		//As soon as object is created constructor is getting called but default constructor will be called

		ConstructorConcept Obj=new ConstructorConcept();//default constructor will be called
		ConstructorConcept Obj1=new ConstructorConcept(10);
		ConstructorConcept Obj2=new ConstructorConcept(10,20);


	}

}
