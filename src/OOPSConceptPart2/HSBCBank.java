package OOPSConceptPart2;

public class HSBCBank implements USBank,BrazilBank{// this way we achieve multiple inheritance
	// also called as Is-a RELATIONSHIP
	// iF any class is implementing the interface then its mandatory to define/override all the methods of inteface.

	//overriding from USBank Interface
	public void credit(){
		System.out.println("HSBC credit method");
	}
	public void debit(){
		System.out.println("HSBC debit method");
	}

	public void transfermoney(){
		System.out.println("HSBC transfermoney method");
	}

	public void carloan(){// non overriden methods
		System.out.println("HSBC Own car loan method");
	}

	public void Educationloan(){// non overriden methods
		System.out.println("HSBC OWN Educationloan method");
	}
	//Brazil bank method from inteface
	public void mutualfund() {
		System.out.println("HSBC mutualfund method");

	}

}
