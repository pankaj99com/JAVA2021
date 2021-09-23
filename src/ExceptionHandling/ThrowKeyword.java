package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// Throw keyword is used when we want to throw the exception
		// deliberately

		System.out.println("Test");
		//
		try {
			throw new Exception("Pankaj's Exception");
		} catch (Exception e) {

			e.printStackTrace();
		}

		// throw new Exception("Pankaj's Exception");//we hev to add Throws
		// Exception but below print statement
		// will throw error because no one is catching the exception not even
		// JVM
		System.out.println("end");
		
		String Exe_flag="N";
		if(Exe_flag.equals("N")){
			try {
				throw new Exception("Execution flag is set to No ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Exception is handled");
		}

	}

}
