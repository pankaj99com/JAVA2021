package MultiThreadingConcepts;

public class ThreadConstructor {

	public static void main(String[] args) {
		
		A2 a=new A2("Pankaj");
		a.start();
		System.out.println("Thread ID is: "+a.getId());
		System.out.println("Thread name is: "+a.getName());
//		System.out.println(a.countStackFrames());
//		System.out.println(a.hashCode());
//		System.out.println(a.isDaemon());
		
		B2 b=new B2("Sandeep");
		b.start();
		System.out.println("Thread ID is: "+b.getId());
		System.out.println("Thread name is: "+b.getName());
//		System.out.println(b.countStackFrames());
//		System.out.println(b.hashCode());
//		System.out.println(b.isDaemon());

	}

}


class A2 extends Thread{
	public A2(String name) {
		super(name);
	}
	@Override
	public void run() {
		int i=40;
		System.out.println("hi");
//		while(true) {
//		System.out.println("I am Thread1 ");
//		System.out.println("Reading java book");
//		
//	}
		
	}
}

class B2 extends Thread{
	public B2(String name) {
		super(name);
	}
	@Override
	public void run() {
		int i=40;
		System.out.println("hello");
//		while(true) {
//		System.out.println("I am Thread1 ");
//		System.out.println("Reading java book");
//		
//	}
		
	}
}