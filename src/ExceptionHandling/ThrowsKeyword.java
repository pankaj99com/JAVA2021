package ExceptionHandling;
//Finally JVM is catching the exception and every methods are simply passing the exception and no one is catching
public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException  {
		System.out.println("Main method is calling sum method");
		ThrowsKeyword obj=  new ThrowsKeyword();
		obj.sum();//origin of the exception is here so all exception should be returned here
		
	

	}
	public void sum() throws ArithmeticException {
		System.out.println("Sum method is calling div method");
		div();
		
	}
   public void div() throws ArithmeticException  {
	System.out.println("This is div method");
	try {
		int i=9/0;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Test method");
	
	
	
}
}
