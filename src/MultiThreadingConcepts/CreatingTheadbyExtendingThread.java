package MultiThreadingConcepts;

public class CreatingTheadbyExtendingThread {

	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		
		a.start();
		b.start();
		
	}

}

class A extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("My Thread1");
			
			System.out.println("Pankaj in Thread1");
		}
		
		
	}
	
}


class B extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("My Thread2");
			
			System.out.println("Sandeep in Thread2");
		}
		
		
	}
	
}