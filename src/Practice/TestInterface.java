package Practice;

public class TestInterface implements childInterface{

	public static void main(String[] args) {
		
		childInterface obj=new  TestInterface();
		obj.write();
		obj.read();
		obj.pankaj();
		
	}

	@Override
	public void read() {
		System.out.println("Read from interface");
		
	}

	@Override
	public void write() {
		System.out.println("Write from interface");
		
	}

	@Override
	public void pankaj() {
		System.out.println("Pankajfrom interface");
		
	}

}
