package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";
		int u=9;
		System.out.println(x+20);
		//I want to convert string 100 to integer.
		//we have to use wrapper class Integer class and use its method

		int i=Integer.parseInt(x);//data conversion from String to int
		System.out.println(i+20);

		//String to Double conversion
		String y="12.87";
		double d=Double.parseDouble(y);
		System.out.println(d+11.11);

		//String to Boolean
		String z="true";
		boolean b= Boolean.parseBoolean(z);
		System.out.println(b);

		//int to String

		int k=234;

		String str=String.valueOf(k);
		System.out.println(str+23);
		
		//Numberformatexception if the string value is not pure numeric value
	     String g="120K";
	     
	     System.out.println(g.substring(0, 3));
	     String str1=g.substring(0, 3);//120
	     int ggg=Integer.parseInt(str1);//120 int
	     System.out.println(ggg);//120
	     int gg=Integer.parseInt(g);//it will throw number format exception
	     System.out.println(gg);
	     
	     
	 
	     
	     
	
	}

}
