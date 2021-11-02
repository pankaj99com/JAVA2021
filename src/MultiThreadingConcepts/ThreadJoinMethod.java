package MultiThreadingConcepts;

public class ThreadJoinMethod {

	public static void main(String[] args) {
		
		
		A4  a=new A4(" Pankaj");
		
		A4 a1=new A4(" pankaj1");
		B4 b=new B4(" Sandeep");
		
		
		a.start();
		try {
			a.join();//it will not go to next thread until thread 1 is finished
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
		

	}

}
class A4 extends Thread{
	public A4(String name) {
		super(name);
	}
	@Override
	public void run() {
		while(true) {
			System.out.println("hello"+this.getName());
		
	}
		
	}
}


class B4 extends Thread{
	public B4(String name) {
		super(name);
	}
	@Override
	public void run() {
		
		
		while(true) {
			System.out.println("hello"+this.getName());
		
	}
		
	}
}