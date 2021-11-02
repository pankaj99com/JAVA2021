package ExceptionHandling;

public class ExceptionHandling {
	int a = 10;


	public static void main(String[] args) {
		// This is an example of Uncaught exception
		// int i=9/0;//java.lang.ArithmeticException: / by zero
		//
		// System.out.println(i);
		
		main(50,20);
		

		// 1.Caught Exception
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			System.out.println("This is going to give InterruptedException");
			e1.printStackTrace();
		} // Compiler will give hint

		ExceptionHandling obj=new  ExceptionHandling();
		System.out.println(obj);
		// ExceptionHandling obj=new ExceptionHandling();
		//obj=null;
		System.out.println(obj.a);// java.lang.NullPointerException

		try {
			int i = 8 / 0;
		} catch (ArithmeticException e) {// Throwrable is the superclass of all
											// Exceptions and Error.So its
											// better to use throwrable in catch
											// block.
			// Also for all kinds of Exceptions super class is Exception and it
			// also can be used.

			System.out.println("This is going to give Arithmetic exception");
			// e.printStackTrace();
			// System.out.println(e.getCause());
			// System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.hashCode());

		}
		System.out.println(" some exception");

	}
	
	public static void main(int x,int y){
		int a=20;
		int b=30;
		int z=x+y;
		System.out.println(z);
	}
	

}
