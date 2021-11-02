package StringClass;

public class StringClassDemo {

	public static void main(String[] args) {
		StringClassDemo obj=new StringClassDemo();
		System.out.println(obj);
		
		String str=new String("pankaj");
		System.out.println(str);
		str.concat("Kumar");// Immutable:-Even though we are changing the string the value is not changing
	String str1="Pankaj";
	System.out.println(str1.equals(str));//equals method is overridden method in String class which is use for content comparison
	System.out.println(str1==str);
	System.out.println(str1.compareTo(str));
		System.out.println(str);//pankaj
		
		StringBuffer sb=new StringBuffer("Pankaj");
		StringBuffer sb1=new StringBuffer("Pankaj");
		System.out.println(sb.equals(sb1));//equals method coming from Object class which is meant for reference comparison
		sb.append("Kumar");
		System.out.println(sb);//Mutable: Value is changing
		char[]ch= {'j','a','v','a'};
		String str2=new String(ch);
		System.out.println(str2);
		
	}

}
