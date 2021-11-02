package OOPSConceptPart2;

public interface USBank {

	int min_bal=1000;
	public  void credit();//waste water,family man,don't put nails
	public void debit();
	public void transfermoney();
//	public void sum() {  we cannot define any other methods with body inside Interface
//		
//	}
	
	//INTERFACE-1.only method declaration
	//2.no method body-only method prototype
	//3.In Inteface we can declare variables but variables are by default static in nature
	//.4.variables values cannot be changed
	//5.No static methods in Interface
	//6.no main method in interface
	//7.we cannot create object of interface
	//8.Interface is abstract in nature and provides 100% abstraction
	

}
