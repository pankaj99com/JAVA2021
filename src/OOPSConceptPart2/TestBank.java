package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
	
		
		System.out.println(USBank.min_bal);
		//USBank.min_bal=2000; static variables value of interface cannot be changed because inteface variables are final in nature
		//USBank obj=new USBank(); canot create object of interface
		
		HSBCBank obj=new HSBCBank();
		obj.credit();
		obj.debit();
		obj.transfermoney();
		obj.Educationloan();
		obj.carloan();
		
		//Dyanamic polymorphism
		//child class object can be referenced by parent interface reference variable
		
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		//b.Educationloan();
		//b.carloan();
// Only overridden methods of interface can be called.		

	}

}
