package MultiThreadingConcepts;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ThreadPriority {

	public static void main(String[] args) {
		
		A3 a1=new A3("Pankaj1 min priority");
		A3 a2=new A3("Pankaj2");
		A3 a3=new A3("Pankaj3");
		A3 a4=new A3("Pankaj4 most important");
		A3 a5=new A3("Pankaj5");
		A3 a6=new A3("Pankaj6");
		A3 a7=new A3("Pankaj7 normal priority" );
		a4.setPriority(Thread.MAX_PRIORITY);
		a1.setPriority(Thread.MIN_PRIORITY);
		a7.setPriority(Thread.NORM_PRIORITY);
		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
		a6.start();
		//a6.join();
		a7.start();
		
	}

}
class A3 extends Thread{
	public A3(String name) {
		super(name);
	}
	@Override
	public void run() {
		//int i=40;
		//System.out.println("hello"+this.getName());
		while(true) {
			System.out.println("hello"+this.getName());
		
	}
		
	}
}