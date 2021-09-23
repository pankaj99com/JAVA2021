package OOPSConceptPart3;

class MyEmployee1 {// Only one class in java program can be public
	private int id;// if variables are defined as private and it cannot be
					// accessible directly
	private String name;// In order to access we have o concept of getters and
						// setters and withh that we can achieve data hinding]

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

	public void setname(String n) {
		name = n;
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
		MyEmployee1 pankaj = new MyEmployee1(9);
		// pankaj.id=9;
		// pankaj.name="pankaj kumar";//Throw error because we are tryig to
		// access private variables
		System.out.println(pankaj.getid());
		System.out.println(pankaj.getname());

	}

}
