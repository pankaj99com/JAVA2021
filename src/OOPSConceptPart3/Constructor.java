package OOPSConceptPart3;

class MyEmployee1 {// Only one class in java program can be public
	private int id;// if variables are defined as private and it cannot be
					// accessible directly
	private String name;// In order to access we have a concept of getters and
						// setters and with that we can achieve data hiding

	public MyEmployee1() {// constructor-No argument accepting.
		id = 10;
		name = "pank";
	}

	public MyEmployee1(String myname, int myid) {// constructor-Accepting 2
													// arguments
		id = myid;
		name = myname;
	}

	public MyEmployee1(int myid) {// constructor-Accepting 1 argument
		id = myid;
		name = "Pankaj09";
	}

	public String getname() {
		return name;

	}

	public void setval(String n,int i) {
		
		boolean isAdmin=true;
		if(!isAdmin) {
			System.out.println("Not allowed to set");
		}else {
			System.out.println("You are Admin and can set values");
			name = n;
			id=i;
		}
		
	}

	public int getid() {
		return id;

	}

	public void setid(int i) {
		id = i;
	}
}

public class Constructor {

	public static void main(String[] args) {
		MyEmployee1 pankaj = new MyEmployee1("Laxmi",15);
		// pankaj.id=9;
		// pankaj.name="pankaj kumar";//Throw error because we are tryig to
		// access private variables
		pankaj.setval("Pankaj",9);
		System.out.println(pankaj.getid());
		System.out.println(pankaj.getname());

	}

}
