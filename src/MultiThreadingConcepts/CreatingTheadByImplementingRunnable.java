package MultiThreadingConcepts;

public class CreatingTheadByImplementingRunnable {

	public static void main(String[] args) {
		
		A1 goli1 =new A1();
		B1 goli2 =new B1();
		Thread bandook1=new Thread(goli1);
		Thread bandook2=new Thread(goli2);
		bandook1.start();
		bandook2.start();
		
	}

}


class A1 implements Runnable{

	@Override
	public void run() {
		while(true) {
		System.out.println("I am Thread1 ");
		System.out.println("Reading java book");
		
	}
		
	}
	
}
	
class B1 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("I am Thread2 ");
			System.out.println("Cooking ");
			
		}
		
	}
	
}