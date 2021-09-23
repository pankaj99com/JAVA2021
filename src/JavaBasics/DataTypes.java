package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		//1.integer
		int i=10;//stack area not heap
		
		int k,l,m;
		//byte x=130;
		//size 8 bits
		//byte ranges from 127 to -128
		//0 is the signed bit and if it is that then its +ve number
		//byte b=125;
		//short s=32769;
		//size 2 bytes (16 bits)
		//Range-  -32768 to 32767
		
		//int size is 4 bytes
		//-2147483648 to 2147483647
	 long  p=2147483647;
		
		//int i=20; //not allowed to declare same variable name
		
		i=20;
		// This is replace the old value with new value
		System.out.println(i);
		
		//2.double
		
		
		double d=20.90;
		double d1=30.89;
		double d2=100;// we can store integer in double
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("pankaj"+d2);
		
		//3.char-single char is allowed and should be written within single quotes
		
		char c='A';
		char c1='\u0032';
		//char c2='AA'; This is not allowed as char takes single char /digits.
		//char c3='11';
		System.out.println(c);
		System.out.println(c1);
		
		//4.boolean
		
		boolean b=true;
		boolean b1=false;
		
		System.out.println(b);
		System.out.println(b1);
		
		//5.String-is a class and multiple character can be written within double quotes
		//String is not primitive data type
		
		String s= "INDIA";
		String s1="12343";
		System.out.println(s);
		System.out.println(s1);
		//System is a class
	}

}
